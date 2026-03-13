import java.util.Stack;

public class reverseOnlyDigits {

    public static void main(String[] str) {
        String input = " I love Java program 20578 since 2022";
        StringBuilder result = new StringBuilder();

        // Reverse only the digits in the string
        for (int i = 0; i < input.length(); ) {

            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                int start = i;
                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    ;
                    i++;
                }
                String digitGroup = input.substring(start, i);
                result.append(new StringBuilder(digitGroup).reverse());
            } else {
                result.append(ch);
                i++;
            }
        }
        System.out.println(" result is " + result.toString());


        // Output: I love Java program 5202 since 2202


//        Now I want output in different way

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < input.length();i++ ) {

            if (Character.isDigit(input.charAt(i))) {
                 st.push((int) input.charAt(i));
                }
        }

        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < input.length();i++ ) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                result2.append((char) (int) st.pop());
            }
            else {
                result2.append(ch);
            }
        }
        System.out.println(" result is "+ result2.toString());



        //Now I want the output just swap the numbers


        }
}
