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


    public FizzBuzzExtra(int laenge, int[] factor, String[] words, int variation) {
        super(laenge, factor, words, variation);
    }


    @Override
    public String[] start() {
        super.createArray();
        super.doFizzBuzz();
        String[] ergebnis = doVariation(array);
        return ergebnis;
    }


    public String[] doVariation(String[] array) {

            //Wenn kein Vielfache, dann Variation (wenn erlaubt)
            /*if (output.equals("")) {
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
            }*/


        return array;

    }
    void ausgabe() {
        System.out.println("-- Die Ergebnisse --");
        for (String s : array) {
            System.out.println(s);
        }
    }
}

