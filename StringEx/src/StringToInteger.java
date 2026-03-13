public class StringToInteger {

    public static void main(String[] str) {

        int num = 0;
        String s= "5p6lk";
       int num2 =  myAtoi(s);

       System.out.println("value is "+ num2);

    }

    public static int myAtoi(String s){

        int num = 0;
        for (int i = 0; i < s.length(); i++) {

            if (!Character.isDigit(s.charAt(i))) {
                break;

            }

            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

        }
        return num;
    }
}
