import java.util.Scanner;

public class FizzBuzzRun {

    static Scanner scanner = new Scanner(System.in);

    public static void howMuch() {
        System.out.println("How many numbers do you want to play with?");
        System.out.print("> ");

    }

    static int quantity = scanner.nextInt();

    static int[] factor = new int [quantity];

    public static void readNumbers() {
        System.out.println("Geben sie die Zahlen ein");
       for (int i = 0; i < quantity; i++){
            System.out.print("> ");
            int input = scanner.nextInt();
            factor[i] = input;
        }
    }

    static String[] word = new String[quantity];

    public static void readWords() {
        System.out.println("Geben sie die Worte ein");

        for (int i = 0; i < quantity; i++){
            System.out.print("> ");
            String input = scanner.next();
            word[i] = input;
        }
    }
}
