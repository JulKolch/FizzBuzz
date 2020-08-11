public class FizzBuzzGame {

    private String[] array;
    private int[] factor;
    private String[] words;
    private int variation;

    public FizzBuzzGame(int laenge, int[] factor, String[] words, int variation) {
        array = new String[laenge];
        this.factor = factor;
        this.words = words;
        this.variation = variation;
    }

    public String[] start() {
        createArray();
        String[] ergebnis = doFizzBuzz();
        return ergebnis;
    }

    private void createArray() {
        //füllen mit Zahlen von 1 bis 100
        for (int zahl = 0; zahl < array.length; zahl++) {
            array[zahl] = String.valueOf(zahl + 1);
        }
    }

    private String[] doFizzBuzz() {

        //Überschreiben
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
                switch (variation){
                case 1:
                    array[zahl] = FizzBuzzExtra.doVariation(array[zahl], factor, words);
                    break;
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

    int find(String[] array, int i) {
        String element = array[i];
        return Integer.parseInt(element.trim());
    }
}
