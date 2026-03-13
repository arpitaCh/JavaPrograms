package org.example;

import java.util.HashMap;
import java.util.Map;

public class GetFreqCharacterAndFindMaxCharWithCount {
    public static void main(String[] args) {

        String str= "aabfdfgghgjjsbbbb";

        char[] ch = str.toCharArray();
        HashMap<Character,Integer> hmap= new HashMap<Character,Integer>();

        for(char ch1: ch){
            if(hmap.containsKey(ch1)){
                int cfreq= hmap.get(ch1);
                hmap.put(ch1,cfreq+1);

//                hmap.put(ch1, hmap.getOrDefault(ch1,0)+1);
            }
            else{
                hmap.put(ch1,1);
            }
        }

        char maxCharacter= 'a';
        int maxCount = 1;

        System.out.println( " keys sets are "+ hmap.keySet());

        for(Map.Entry<Character,Integer> map: hmap.entrySet()){

            System.out.println(" here key is "+ map.getKey() +" value is "+ map.getValue());
        }

        for(char key : hmap.keySet()){
            if(hmap.get(key)> maxCount){
                  maxCount= hmap.get(key);
                  maxCharacter = key;

            }
        }
        System.out.println(" here maxCharacter is "+ maxCharacter +" value is "+ maxCount);




        System.out.println("Hello world!");
    }
}