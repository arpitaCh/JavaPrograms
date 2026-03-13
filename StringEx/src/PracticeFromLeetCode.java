import java.util.HashMap;
import java.util.Map;

public class PracticeFromLeetCode {

    public static void main(String[] str){

        //string decoding

        String str2 = "AAAABB";

        StringBuilder sb = new StringBuilder();

        char[] ch = str2.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char ch2: ch) {

            map.put(ch2, map.getOrDefault(ch2, 0) + 1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){

            sb.append(entry.getKey()).append(entry.getValue());

        }

        System.out.println(" string is "+ sb.toString());



        // integer decoding

        int n = 1211;





    }
}
