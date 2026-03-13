import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringoutputFormation {

    public static void main(String[] str){

        String str1= "aBACbcEDed";
        StringBuilder capitalcaseLetter = new StringBuilder();
        StringBuilder lowercaseLetter = new StringBuilder();

        for(char ch : str1.toCharArray()){

            if(Character.isUpperCase(ch)){
                capitalcaseLetter.append(ch);
            }
            if(Character.isLowerCase(ch)){
                lowercaseLetter.append(ch);
            }


        }

        System.out.println("captial case is "+ capitalcaseLetter.toString());

        char[] ch1 = capitalcaseLetter.toString().toCharArray();
        Arrays.sort(ch1);
        System.out.println("sorted captial case is "+ new String(ch1));

        System.out.println(" lower case is "+ lowercaseLetter.toString());



        String str2= "a1A4b5E6e7";
        StringBuilder digit = new StringBuilder();
        StringBuilder Letter = new StringBuilder();

        for(char ch : str2.toCharArray()){

            if(Character.isAlphabetic(ch)){
                Letter.append(ch);
            }
            if(Character.isDigit(ch)){
                digit.append(ch);
            }


        }

        System.out.println("Letter is "+ Letter);

        System.out.println(" digit case is "+ digit);

//
//        String str3= "aabbbbsssffcccddebb";
//
//        StringBuilder result = new StringBuilder();
//
//        Map<Character,Integer> map = new TreeMap<Character,Integer>();
//
//        for(char ch : str3.toCharArray()){
//            map.put(ch, map.getOrDefault(ch,0)+1);
//        }
//
//        for(Map.Entry<Character,Integer> entry: map.entrySet()){
//           result = result.append(entry.getKey()).append(entry.getValue());
//        }
//        System.out.println(" result is "+ result);


        String str4= "a2b6c3d2e1f2s3e5";
        StringBuilder result2 = new StringBuilder();

        StringBuilder finalResult = new StringBuilder();

        Map<Character,Integer> map3 = new HashMap<>();
        for(int i=0 ;i<str4.length();){

            char ch = str4.charAt(i);
            i++;

            while( i <str4.length() && Character.isDigit(str4.charAt(i))){
                result2.append(str4.charAt(i));
                i++;
            }

            int resultval=Integer.parseInt(result2.toString());

            map3.put(ch, map3.getOrDefault(ch,0)+ resultval);

        }
        for(Map.Entry<Character,Integer> entry : map3.entrySet()){
            finalResult.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(" result is "+ finalResult);
    }
}
