public class FizzBuzzGame {
    public static void main(String[] args) {

        String[] array = new String[100];

        System.out.println("How many numbers do you want to play with?"); // nicht hier!!
        System.out.print("> ");
        //FizzBuzzRun.howMuch();
        FizzBuzzRun.readNumbers();
        FizzBuzzRun.readWords();
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

        int[] factor = FizzBuzzRun.factor;
        String[] word = FizzBuzzRun.word;


       for (int zahl = 0; zahl < 100; zahl++) {
            String element = array[zahl];
            Integer elemInt = Integer.parseInt(element.trim());
            String output = "";

           for (int i = 0; i < FizzBuzzRun.quantity; i++) {
               if (elemInt % factor[i] == 0) {
                   output += word[i];
                   //System.out.println(array[zahl] + "------>" + word[i]);
               }
               if (output != ""){
                   array[zahl]= output;
               }
           }
       }

        return array;

    }

   /* public static String doVariation(String s){
        int lange = s.length();
        int i = 0;
        int zahl = Integer.parseInt(s);
        while (lange!= 0){
            i = zahl%10;
            zahl = zahl/10;
            lange--;
            if (i == FizzBuzzRun.factor1){
                s = FizzBuzzRun.word1 + "!!!";
                break;
            } else if (i == FizzBuzzRun.factor2){
                s = FizzBuzzRun.word2  + "!!!";
                break;
            }
        }
        return s;
    }*/

    static void Ausgabe(String[] array){
        System.out.println("-- Die Ergebnisse --");
        for (int i =0; i <array.length; i++){
            System.out.println(array[i]);
        }
    }

    static String find(String[] array, int i){

        return array[i];
    }
}
