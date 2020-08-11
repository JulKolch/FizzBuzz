/**
 * @Yulia - hier ein Serviervorschlag :-D
 * public class FizzBuzzExtra extends FizzBuzzGame {
 * <p>
 * public FizzBuzzExtra(int laenge, int[] factor, String[] words, int variation) {
 * super(laenge, factor, words, variation);
 * }
 * @Override public String[] start() {
 * super.createArray();
 * String[] ergebnis = doFizzBuzz();
 * return ergebnis;
 * }
 * @Override protected String[] doFizzBuzz() {
 * //@Yulia - hier kommt dann dein doVariationCode rein
 * }
 * }
 */

public class FizzBuzzExtra extends FizzBuzzGame {

    private String[] array;
    private int[] factor;
    private String[] words;
    private int variation;

    public FizzBuzzExtra(int laenge, int[] factor, String[] words, int variation) {
        super(laenge, factor, words, variation);
    }


    @Override
    public String[] start() {
        super.createArray();
        String[] ergebnis = doFizzBuzz();
        return ergebnis;
    }

    @Override
    protected String[] doFizzBuzz() {
        //@Yulia - hier kommt dann dein doVariationCode rein

        for (int zahl = 0; zahl < array.length; zahl++) {
            String element = array[zahl];
            int elemInt = Integer.parseInt(element.trim());
            String output = "";

            for (int i = 0; i < factor.length; i++) {
                if (elemInt % factor[i] == 0) {
                    output += words[i];
                }
            }
            //Wenn die Zahl ein Vielfache ist
            if (!output.equals("")) {
                array[zahl] = output;
            }
            //Wenn kein Vielfache, dann Variation (wenn erlaubt)
            if (output.equals("")) {
                for (int i = 0; i < factor.length; i++) {
                    int lange = element.length();
                    int ziffer = 0;
                    int zahl1 = Integer.parseInt(element);
                    while (lange > 0) {
                        ziffer = zahl1 % 10;
                        zahl1 = zahl1 / 10;

                        if (ziffer == factor[i]) {
                            output += words[i];
                        }
                        lange--;
                    }
                }
                //Wenn Zufälle gefunden
                if (!output.equals("")) {
                    output += "!!!";
                    array[zahl] = output;
                }
            }
        }

        return array;

    }
    void ausgabe() {
        System.out.println("-- Die Ergebnisse --");
        for (String s : array) {
            System.out.println(s);
        }
    }
}

