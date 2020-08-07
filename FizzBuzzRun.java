import java.util.Scanner;

public class FizzBuzzRun {

    private FizzBuzzGame fizzbuzzGame;
    static Scanner scanner = new Scanner(System.in);
    int quantity;
    boolean variation = askVariation();

    public void main(String[] args) {
        quantity = howMuch();

        int[] factor = readNumbers();

        String[] words = readWords();
        fizzbuzzGame = new FizzBuzzGame(quantity, factor, words);
        fizzbuzzGame.start();
        fizzbuzzGame.ausgabe();
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

    boolean askVariation() {
        System.out.println("Möchten Sie Variation aufrufen? [y oder n}");
        String input = scanner.next();
        if (input.equals("y") || input.equals("Y")) {
            return true;
        } else if (input.equals("n") || input.equals("N")) {
            return false;
        } else {
            System.out.println("Falsche Eingabe, wird aber trotzdem aufgerufen");
            return false;
        }


    }
}
