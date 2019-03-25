public class Kata {

    public static String expandedForm(int num) {

        String number = String.valueOf(num);
        char[] numbers = number.toCharArray();
        String result = "";

        for( int i =0; i<number.length(); i++ ){
            if(numbers[i] != '0'){
                result = result + numbers[i];
                for(int j=i+1; j<number.length(); j++  ){
                    result = result + "0";
                }
                result = result + " + ";
            }else{
                continue;
            }
        }
        return result.substring(0,result.length()-3);

    }


}
