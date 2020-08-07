public class FizzBuzzExtra {

    public boolean variation = false;
    public static String doVariation(String str, int[] factor, String[] word) {

        String output = "";

        for (int i = 0; i < factor.length; i++) {
            int lange = str.length();
            int ziffer = 0;
            int zahl = Integer.parseInt(str);
            while (lange > 0) {
                ziffer = zahl % 10;
                zahl = zahl / 10;

                if (ziffer == factor[i]) {
                    output += word[i];
                }
                lange--;
            }
        }
        //Wenn Zufälle gefunden
        if (!output.equals("")) {
            output += "!!!";
            str = output;
        }
        return str;
    }

}
