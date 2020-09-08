import static java.lang.Integer.parseInt;

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
        array = super.doFizzBuzz();
        String[] ergebnis = doVariation();
        return ergebnis;
    }

    public boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

    public String[] doVariation() {

        //Wenn kein Vielfache, dann Variation
        for (int zahl = 0; zahl < array.length; zahl++) {

            //Nur für Zahlen in Array
            if (isNumeric(array[zahl])) {
                String element = array[zahl];
                int elemInt = Integer.parseInt(element.trim());
                output = "";
                for (int i = 0; i < factor.length; i++) {
                    int lange = element.length();
                    int ziffer = 0;
                    int zahl1 = elemInt;
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

