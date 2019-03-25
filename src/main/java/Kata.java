public class Kata {

    public static String expandedForm(int num) {

        String number = String.valueOf(num);
        char[] numbers = number.toCharArray();
        String result = "";

        for( int i =0; i<number.length(); i++ ){
            result = result + numbers[i];
            for(int j=i+1; j<number.length(); j++  ){
                result = result + "0";
            }
            result = result + " + ";
        }

        return result.substring(0,result.length()-2);

    }


}
