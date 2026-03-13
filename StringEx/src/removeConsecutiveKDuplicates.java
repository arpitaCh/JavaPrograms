import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class removeConsecutiveKDuplicates {

public static void main(String[] str){

    String input = "aabbbbcccdefas";

//    Set<Character> set = new LinkedHashSet<>();
//    StringBuilder result = new StringBuilder();
//    for( int i =1 ; i < input.length(); i++){
//
//        if(input.charAt(i) == input.charAt(i-1)){
////            set.add(input.charAt(i+1));
//            result.append(input.charAt(i));
//        }
//        else{
////            set.add(input.charAt(i));
//            result.append(input.charAt(i-1));
//        }
//
//    }

//    set.add(input.charAt(input.length() - 1));
//
//    StringBuilder finalResult = new StringBuilder();
//
//    for(char ch : set){
//        finalResult.append(ch);
//    }

//    System.out.println(" value is "+ result.toString());

//==================================================================

    StringBuilder result = new StringBuilder();
    int count = 0;

    for (int i = 0; i < input.length(); i++) {

        if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
            count++;

            if (count != 3) {
                result.append(input.charAt(i+1));
            }
        } else {
            if (count < 3) {
                result.append(input.charAt(i));
            }
            count = 1; // Reset count for the next character
        }
    }

    System.out.println(result.toString());


}

}
