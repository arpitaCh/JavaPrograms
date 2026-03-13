import java.util.HashMap;
import java.util.Map;

public class StringEncodeAndDecode {

    public static void main(String[] str) {

//        String encodeStr = "A12b20c11b12";
//
//        encodeStr(encodeStr);

        String decodeStr= "AAAbbcccc";
        decodeStr(decodeStr);

    }

    private static void decodeStr(String decodeStr) {
        StringBuilder finalResult = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

//        for (int i = 0; i < decodeStr.length(); i++) {
//            char ch = decodeStr.charAt(i);

        for(char ch :decodeStr.toCharArray()){

            map.put(ch, map.getOrDefault(ch, 0) + 1);
//            int count= map.get(ch);
//            count++;
//            map.replace(ch, count);


        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            finalResult.append(entry.getKey()).append(entry.getValue());
        }

        System.out.print(finalResult.toString());
    }


//    private static void encodeStr(String str) {
//        for(int i =0 ; i< str.length() ;i++){
//
//            if(Character.isAlphabetic(str.charAt(i))){
//               System.out.print(str.charAt(i));
//            }
//            else{
//                int x = Character.getNumericValue(str.charAt(i));
//                for(int j=1 ; j<x ;j++){
//                    System.out.print(str.charAt(i-1));
//                }
//            }
//
//        }
//    }


    private static void encodeStr(String str) {

        Map<Character,Integer> map= new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); ) {
            char ch = str.charAt(i);
            i++;


//            if (Character.isAlphabetic(ch)) {
//            System.out.print(ch);

                StringBuilder numbuilder = new StringBuilder();
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    numbuilder.append(str.charAt(i));
                    i++;
                }
//                if (numbuilder.length() > 0) {
                    int count = Integer.parseInt(numbuilder.toString());

//                    for (int j = 1; j < count; j++) {
//                        System.out.print(ch);
//                    }

                    map.put(ch, map.getOrDefault(ch,0)+count);

//                }
            }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
          result.append(entry.getKey()).append(entry.getValue());
        }
        System.out.print(" here result is "+ result.toString());

        }
    }

