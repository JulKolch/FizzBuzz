import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    //String[] array = new String[100];
    String[] antwort = new String[] { String.valueOf(1), String.valueOf(2), "Fizz", String.valueOf(4), "Buzz", "Fizz",
            String.valueOf(7), String.valueOf(8), "Fizz", "Buzz", String.valueOf(11), "Fizz", String.valueOf(13),
            String.valueOf(14), "FizzBuzz", String.valueOf(16), String.valueOf(17), "Fizz", String.valueOf(19), "Buzz",
            "Fizz", String.valueOf(22), String.valueOf(23), "Fizz", "Buzz", String.valueOf(26), "Fizz",
            String.valueOf(28), String.valueOf(29), "FizzBuzz", String.valueOf(31), String.valueOf(32), "Fizz",
            String.valueOf(34), "Buzz", "Fizz", String.valueOf(37), String.valueOf(38), "Fizz", "Buzz",
            String.valueOf(41), "Fizz", String.valueOf(43), String.valueOf(44), "FizzBuzz", String.valueOf(46),
            String.valueOf(47), "Fizz", String.valueOf(49), "Buzz", "Fizz", String.valueOf(52), String.valueOf(53),
            "Fizz", "Buzz", String.valueOf(56), "Fizz", String.valueOf(58), String.valueOf(59), "FizzBuzz",
            String.valueOf(61), String.valueOf(62), "Fizz", String.valueOf(64), "Buzz", "Fizz", String.valueOf(67),
            String.valueOf(68), "Fizz", "Buzz", String.valueOf(71), "Fizz", String.valueOf(73), String.valueOf(74),
            "FizzBuzz", String.valueOf(76), String.valueOf(77), "Fizz", String.valueOf(79), "Buzz", "Fizz",
            String.valueOf(82), String.valueOf(83), "Fizz", "Buzz", String.valueOf(86), "Fizz", String.valueOf(88),
            String.valueOf(89), "FizzBuzz", String.valueOf(91), String.valueOf(92), "Fizz", String.valueOf(94), "Buzz",
            "Fizz", String.valueOf(97), String.valueOf(98), "Fizz", "Buzz" };
    String[] antwortOhneFizzBuzz = new String[] { String.valueOf(1), String.valueOf(2), String.valueOf(3),
            String.valueOf(4), String.valueOf(5), String.valueOf(6), String.valueOf(7), String.valueOf(8),
            String.valueOf(9), String.valueOf(10), String.valueOf(11), String.valueOf(12), String.valueOf(13),
            String.valueOf(14), String.valueOf(15), String.valueOf(16), String.valueOf(17), String.valueOf(18),
            String.valueOf(19), String.valueOf(20), String.valueOf(21), String.valueOf(22), String.valueOf(23),
            String.valueOf(24), String.valueOf(25), String.valueOf(26), String.valueOf(27), String.valueOf(28),
            String.valueOf(29), String.valueOf(30), String.valueOf(31), String.valueOf(32), String.valueOf(33),
            String.valueOf(34), String.valueOf(35), String.valueOf(36), String.valueOf(37), String.valueOf(38),
            String.valueOf(39), String.valueOf(40), String.valueOf(41), String.valueOf(42), String.valueOf(43),
            String.valueOf(44), String.valueOf(45), String.valueOf(46), String.valueOf(47), String.valueOf(48),
            String.valueOf(49), String.valueOf(50), String.valueOf(51), String.valueOf(52), String.valueOf(53),
            String.valueOf(54), String.valueOf(55), String.valueOf(56), String.valueOf(57), String.valueOf(58),
            String.valueOf(59), String.valueOf(60), String.valueOf(61), String.valueOf(62), String.valueOf(63),
            String.valueOf(64), String.valueOf(65), String.valueOf(66), String.valueOf(67), String.valueOf(68),
            String.valueOf(69), String.valueOf(70), String.valueOf(71), String.valueOf(72), String.valueOf(73),
            String.valueOf(74), String.valueOf(75), String.valueOf(76), String.valueOf(77), String.valueOf(78),
            String.valueOf(79), String.valueOf(80), String.valueOf(81), String.valueOf(82), String.valueOf(83),
            String.valueOf(84), String.valueOf(85), String.valueOf(86), String.valueOf(87), String.valueOf(88),
            String.valueOf(89), String.valueOf(90), String.valueOf(91), String.valueOf(92), String.valueOf(93),
            String.valueOf(94), String.valueOf(95), String.valueOf(96), String.valueOf(97), String.valueOf(98),
            String.valueOf(99), String.valueOf(100) };

    @Test
    public void doFizzBuzzTest() {
        String[] array = new String[100];

        int[] factor = new int[] { 3, 5 };
        String[] words = new String[] { "Fizz", "Buzz" };
        int variation = 2;

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(array.length, factor, words, variation);
        String[] ergebnis = fizzBuzzGame.start();
        assertArrayEquals(antwort, ergebnis);
    }

    @Test
    public void easyTest() {
        int[] factor = new int[] { 2, 5, 7 };
        String[] words = new String[] { "AAA", "BBB", "CCC" };
        int variation = 2;

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(10, factor, words, variation);
        String[] ergebnis = fizzBuzzGame.start();

        assertEquals("AAA", ergebnis[1]);
        assertEquals("AAABBB", ergebnis[9]);
    }

    @Test
    public void blubb1_fuer10_liefert10xBlubb_test() {
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = "" + (i + 1);
        }

        for (int i = 0; i < array.length; i++) {
            String element = array[i];
            int elemInt = Integer.parseInt(element.trim());
            if (elemInt % 1 == 0) {
                array[i] = "Blubb";
            }
        }

        assertEquals("Blubb", array[0]);
        assertEquals("Blubb", array[1]);
        assertEquals("Blubb", array[5]);
        assertEquals("Blubb", array[8]);
        assertEquals("Blubb", array[9]);

    }

    @Test
    public void testFind() {
        String[] array = new String[100];
        int[] factor = new int[] { 3, 5 };
        String[] words = new String[] { "Fizz", "Buzz" };
        int variation = 2;

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(array.length, factor, words, variation);
        String[] ergebnis = fizzBuzzGame.start();
        int i = 1;
        assertEquals(i + 1, fizzBuzzGame.find(ergebnis, i));
    }

    @Test
    public void testVariation() {
        String[] array = new String[100];
        int[] factor = new int[] { 3, 5 };
        String[] words = new String[] { "Fizz", "Buzz" };
        int variation = 2;

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(array.length, factor, words, variation);
        String[] ergebnis = fizzBuzzGame.start();
    }

    @Test
    public void testMaximum() {
        String[] array = new String[1000000];
        int[] factor = new int[] { 3, 5 };
        String[] words = new String[] { "Fizz", "Buzz" };
        int variation = 2;
        int i = 56457;

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(array.length, factor, words, variation);
        String[] ergebnis = fizzBuzzGame.start();
        assertEquals(String.valueOf(i+1), ergebnis[i]);
    }

    @Test
    public void testMinimum() {
        String[] array = new String[1];
        int[] factor = new int[] { 2 };
        String[] words = new String[] { "Fizz"};
        int variation = 2;
        int i = 0;

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(array.length, factor, words, variation);
        String[] ergebnis = fizzBuzzGame.start();
        assertEquals(String.valueOf(i+1), ergebnis[i]);
    }

}
