import java.util.Scanner;

public class FizzBuzzRun {
    private static int quantity;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FizzBuzzRun fizzbuzzRun = new FizzBuzzRun(quantity);
        quantity = fizzbuzzRun.howMuch();
        int[] factor = fizzbuzzRun.readNumbers();
        String[] words = fizzbuzzRun.readWords();
        int variation = fizzbuzzRun.askVariation();
        if(variation == 1){
            FizzBuzzExtra fizzBuzzExtra = new FizzBuzzExtra(100, factor, words, variation);
            fizzBuzzExtra.start();
            fizzBuzzExtra.ausgabe();
        } else {
            FizzBuzzGame fizzbuzzGame = new FizzBuzzGame(100, factor, words, variation);
            fizzbuzzGame.start();
            fizzbuzzGame.ausgabe();
        }
    }
    public FizzBuzzRun(int quantity){
        FizzBuzzRun.quantity = quantity;
    }

    private int howMuch() {
        System.out.println("How many numbers do you want to play with?");
        System.out.print("> ");
        return scanner.nextInt();
    }

    private int[] readNumbers() {
        int[] factor = new int[quantity];
        System.out.println("Geben sie die Zahlen ein");
        for (int i = 0; i < quantity; i++) {
            System.out.print("> ");
            int input = scanner.nextInt();
            factor[i] = input;
        }
        return factor;
    }

    private String[] readWords() {
        String[] word = new String[quantity];
        System.out.println("Geben sie die Worte ein");
        for (int i = 0; i < quantity; i++) {
            System.out.print("> ");
            String input = scanner.next();
            word[i] = input;
        }
        return word;
    }

    private int askVariation() {
        System.out.println("Welche Variation möchten Sie aufrufen?");
        System.out.println("[Ziffernersatz - 1 oder keine - 2}");
        int input = scanner.nextInt();
        if (input == 1) {
            return 1;
        } else if (input == 2) {
            return 2;
        } else {
            System.out.println("Falsche Eingabe, wird aber trotzdem aufgerufen");
            return 2;
        }


    }
}
