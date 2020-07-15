public class FizzBuzzRun {
    public static void main(String[] args) {

        String[] array = new String[100];

        FizzBuzzPlay.readNumbers();
        FizzBuzzPlay.readWords();
        CreateArray(array);
        doFizzBuzz(array);
        Ausgabe(array);
    }

    public static void CreateArray(String[] array){
        //füllen mit Zahlen von 1 bis 100
        for(int zahl = 0; zahl <100; zahl++){
            array[zahl] = String.valueOf(zahl+1);
        }
    }


    public static String[] doFizzBuzz(String[] array){
        //Überschreiben

        int factor1 = FizzBuzzPlay.factor1;
        int factor2 = FizzBuzzPlay.factor2;
        String word1 = FizzBuzzPlay.word1;
        String word2 = FizzBuzzPlay.word2;

        for(int zahl = 0; zahl <100; zahl++){
            String element = array[zahl];
            Integer elemInt = Integer.parseInt(element.trim());

            if (elemInt % factor1 == 0 && elemInt % factor2 == 0) {  //Vielfache von 3 und 5
                array[zahl] = word1 + word2;
            } else if (elemInt % factor1 == 0) {           //Vielfache von 3
                array[zahl] = word1;
            }else if (elemInt % factor2 == 0) {            //Vielfache von 5
                array[zahl] = word2;
            } else array[zahl] = doVariation(array[zahl]);
        }
        return array;

    }

    public static String doVariation(String s){
        int lange = s.length();
        int i = 0;
        int zahl = Integer.parseInt(s);
        while (lange!= 0){
            i = zahl%10;
            zahl = zahl/10;
            lange--;
            if (i == FizzBuzzPlay.factor1){
                s = FizzBuzzPlay.word1 + "!!!";
                break;
            } else if (i == FizzBuzzPlay.factor2){
                s = FizzBuzzPlay.word2  + "!!!";
                break;
            }
        }
        return s;
    }

    static void Ausgabe(String[] array){
        System.out.println("-- Die Ergebnisse --");
        for (int i =0; i <array.length; i++){
            System.out.println(array[i]);
        }
    }
}