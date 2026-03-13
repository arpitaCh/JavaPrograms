import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] str){

        String input = "ppqqabcdcdabcbb";
        String result = findLongestSubstring(input);
        System.out.println("Longest substring: " + result);
        System.out.println("Length: " + result.length());


    }

    private static String findLongestSubstring(String str) {

        int left = 0;
        int right = 0;
        int maxLength = 0;
        int start = 0;
        int n = str.length();

        Set<Character> set = new HashSet<>();

//        while(right < n) {
//            char c = str.charAt(right);
//            if (!set.contains(c)) {
//                set.add(c);
//                if (right - left + 1 > maxLength) {
//                    maxLength = right - left + 1;
//                    start = left;
//                }
//                right++;
//
//            } else {
//                set.remove(str.charAt(left++));
//            }
//        }

//            return str.substring(start,start+maxLength);


        while(right < n){
            char c = str.charAt(right);
            if(!set.contains(c)){
                set.add(c);
            if(right -left +1 >maxLength){
                maxLength = right-left+1;
                start= left;
            }
                right++;
            }else{
                set.remove(str.charAt(left));
                left++;
            }
        }
        return str.substring(start,start+maxLength);
    }

}
