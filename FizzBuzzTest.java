import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    //String[] array;
    String[] array = new String[100];
    //FizzBuzz[] array = new FizzBuzz[100];
    String[] antwort = new String[]{String.valueOf(1), String.valueOf(2), "Fizz", String.valueOf(4), "Buzz", "Fizz", String.valueOf(7), String.valueOf(8), "Fizz", "Buzz", String.valueOf(11), "Fizz", String.valueOf(13), String.valueOf(14), "FizzBuzz", String.valueOf(16), String.valueOf(17), "Fizz", String.valueOf(19), "Buzz", "Fizz", String.valueOf(22), String.valueOf(23), "Fizz", "Buzz", String.valueOf(26), "Fizz", String.valueOf(28), String.valueOf(29), "FizzBuzz", String.valueOf(31), String.valueOf(32), "Fizz", String.valueOf(34), "Buzz", "Fizz", String.valueOf(37), String.valueOf(38), "Fizz", "Buzz", String.valueOf(41), "Fizz", String.valueOf(43), String.valueOf(44), "FizzBuzz", String.valueOf(46), String.valueOf(47), "Fizz", String.valueOf(49), "Buzz", "Fizz", String.valueOf(52), String.valueOf(53), "Fizz", "Buzz", String.valueOf(56), "Fizz", String.valueOf(58), String.valueOf(59), "FizzBuzz", String.valueOf(61), String.valueOf(62), "Fizz", String.valueOf(64), "Buzz", "Fizz", String.valueOf(67), String.valueOf(68), "Fizz", "Buzz", String.valueOf(71), "Fizz", String.valueOf(73), String.valueOf(74), "FizzBuzz", String.valueOf(76), String.valueOf(77), "Fizz", String.valueOf(79), "Buzz", "Fizz", String.valueOf(82), String.valueOf(83), "Fizz", "Buzz", String.valueOf(86), "Fizz", String.valueOf(88), String.valueOf(89), "FizzBuzz", String.valueOf(91), String.valueOf(92), "Fizz", String.valueOf(94), "Buzz", "Fizz", String.valueOf(97), String.valueOf(98), "Fizz", "Buzz"};


   @Test
    public void doFizzBuzzTest() {
       String[] array = new String[100];
       FizzBuzzRun.CreateArray(array);
       FizzBuzzRun.doFizzBuzz(array);
        //FizzBuzzRun.Ausgabe(array);
        assertArrayEquals(antwort, array);
    }


    @Test
    public void find() {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        FizzBuzzRun.doFizzBuzz(array);
        assertEquals("Fizz", FizzBuzzPlay.find(array, index));

    }

}