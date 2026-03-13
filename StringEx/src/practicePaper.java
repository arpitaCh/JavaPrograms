import java.security.Key;
import java.util.*;

public class practicePaper {

    public static void main(String[] str){

        String[] input = {"eat","ate", "tan","ant","bat"};
        List<List<String>> result =  groupAnagram(input);

        for(List<String> anagramResult : result){
             System.out.println("result is "+ anagramResult);
        }



        int[] a ={1,2,3};

        reverseArray(a);
        System.out.println("Reversed array is "+ Arrays.toString(a));

    }

    private static void reverseArray(int[] a) {
        int start=0;
        int end = a.length-1;
        while(start< end){
            int temp = a[start];
            a[start] = a[end];
            a[end]= temp;
            start ++;
            end--;
        }

    }

    private static List<List<String>> groupAnagram(String[] input) {

        Map<String,List<String>> map = new HashMap<>();
        for(String word: input){

            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
