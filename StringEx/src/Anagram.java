import java.util.*;

public class Anagram {

    public static void main(String[] str) {


        int i = 1;          // 1️⃣ initialization

        while (i <= 5) {   // 2️⃣ condition
            System.out.println(i);
            i++;           // 3️⃣ update
        }

        int n = 1234;
        int count =0;
        while(n>0){
//            n = n%10;
            n = n/10;
            count ++;

        }
        System.out.println(" count is "+ count);

        String[] input = {"eat", "ate", "tea", "nat", "tan", "bat"};

        List<List<String>> result = groupAnagrams(input);

        for(List<String> group : result ){
            System.out.println(group);
        }
    }

    private static List<List<String>> groupAnagrams(String[] input) {
        Map<String,List<String>> map = new HashMap<>();

        for(String str: input){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            System.out.println(" here value of key is "+ key);
            map.computeIfAbsent(key, k->new ArrayList<>()).add(str);
        }

        System.out.println(" keys are "+ map.keySet());
        return new ArrayList<>(map.values());

    }



}

