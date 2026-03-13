import apple.laf.JRSUIUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FivetranQuestion1 {

    public static void main(String[] str){

//        String input = "a3b20c4b52";
//
//        Map<Character,Integer> map = new TreeMap<>();
//
//
//        for(int i=0 ;i<input.length();){
//
//            char ch = input.charAt(i);
//            i++;
//           StringBuilder num = new StringBuilder();
//
//           while( i<input.length() && Character.isDigit(input.charAt(i))){
//               num.append(input.charAt(i));
//               i++;
//           }
//
//           int count = Integer.parseInt(num.toString());
//           map.put(ch,map.getOrDefault(ch,0)+count);
//        }
//
//        StringBuilder result = new StringBuilder();
//
//        for(Map.Entry<Character,Integer> entry: map.entrySet()){
//            result.append(entry.getKey()).append(entry.getValue());
//        }
//        System.out.println( "result is "+ result);



        String str4= "a3b20c4b52";

        Map<Character,Integer> map3 = new HashMap<>();
        StringBuilder finalResult = new StringBuilder();
        for(int i=0 ;i<str4.length();){

            char ch = str4.charAt(i);
            i++;
            StringBuilder result2 = new StringBuilder();

            while(
                    i <str4.length() &&
                             Character.isDigit(str4.charAt(i))){
                result2.append(str4.charAt(i));
                i++;
            }

            int count=Integer.parseInt(result2.toString());

            map3.put(ch, map3.getOrDefault(ch,0)+ count);

        }

        for(Map.Entry<Character,Integer> entry : map3.entrySet()){
            finalResult.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(" result is "+ finalResult);



    }
}
