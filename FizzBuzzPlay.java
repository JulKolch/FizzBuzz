import java.util.Scanner;

public class FizzBuzzPlay {
    static Scanner scanner = new Scanner(System.in);

    static int factor1;
    static int factor2;

    public static void readNumbers() {
        System.out.println("Geben sie die Zahlen ein");
        System.out.print("> ");
        int input1 = scanner.nextInt();
        factor1 = input1;
        System.out.print("> ");
        int input2 = scanner.nextInt();
        factor2 = input2;
    }

    static String word1;
    static String word2;

    public static void readWords() {
        System.out.println("Geben sie die Worte ein");
        System.out.print("> ");
        String input1 = scanner.next();
        word1 = input1;
        System.out.print("> ");
        String input2 = scanner.next();
        word2 = input2;
    }

    //static String word3 = word1+word2;

    //static int factor3 = factor1*factor2;

    static String find(String[] array, int i){

        return array[i];
    }


}