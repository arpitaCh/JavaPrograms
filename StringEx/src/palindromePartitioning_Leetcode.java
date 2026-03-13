import java.util.ArrayList;
import java.util.List;

public class palindromePartitioning_Leetcode {

    public static void main(String[] str){

        String s = "aab";
        List<List<String>> result=  palindromePartition(s);

       System.out.println(" result is "+ result);


        }

    private static List<List<String>> palindromePartition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> partition = new ArrayList<>();
        getAllParts(s, partition, result);
        return result;
    }

    private static void getAllParts(String s, List<String> partition, List<List<String>> result) {

        if (s.isEmpty()) {
            result.add(new ArrayList<>(partition));
            return;
        }
            for(int i = 0 ; i<s.length(); i++ ){

                String part = s.substring( 0, i+1);

                System.out.println(" here part is "+ part  + " value of i is "+ i);

                if(isPalindrome(part)){
                    partition.add(part);
                    getAllParts(s.substring(i+1),partition, result);
                    partition.remove(partition.size()-1);
                }

            }




}

    private static boolean isPalindrome(String part) {

        boolean ispalindromeResult = false;
        StringBuilder sb = new StringBuilder(part);
        sb= sb.reverse();

        if(part.equalsIgnoreCase(sb.toString())){
            ispalindromeResult= true;

        }
        return ispalindromeResult;
    }
}
