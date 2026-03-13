package org.example;

import java.util.*;

import static java.util.Collections.swap;

public class Test1 {

    public static void main(String[] str) {

        String input = "aabbcccddeghhr";

        Map<Character, Integer> map = new HashMap<>();


        for (char ch : input.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {

            sb.append(entry.getKey()).append(entry.getValue());

        }
        System.out.println("result is " + sb.toString());
        System.out.print(" unique key are ");
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {

           if(entry.getValue() ==1){

               System.out.print( entry.getKey() + " , ");
           }

        }


//        System.out.println(" even indexed characters are ");
        char [] ch = input.toCharArray();

        for( int  i= 0 ; i< ch.length; i++){

            if(i%2 ==0){
                System.out.print(ch[i]);
            }

        }

        //print each letter twice

        System.out.println("\n each letter twice is ");

        for (char c : input.toCharArray()) {
            System.out.print(c);
            System.out.print(c);
        }

//        count vowel and consonant
        int vowelCount = 0;
        int consonantCount =0;
        for(char c : input.toCharArray()){

            if( c=='a' || c=='e' || c == 'o' || c =='i' || c =='u' ){
                vowelCount++;
            }
            else{
                consonantCount++;
            }
        }

        System.out.println(" vowelCount"+ vowelCount);
        System.out.println(" consonant Count"+ consonantCount);

        Set<Character> vowelSet = new HashSet<>();
        Set<Character> consonantSet = new HashSet<>();
        for(char c : input.toCharArray()){

            if( c=='a' || c=='e' || c == 'o' || c =='i' || c =='u' ){
                vowelSet.add(c);
            }
            else{
                consonantSet.add(c);
            }
        }

        System.out.println(" vowelCount"+ vowelSet.size());
        System.out.println(" consonant count"+ consonantSet.size());







        int[] a= {2,3,4,5};
        int temp = a[0];
        for(int i = 0 ; i <a.length-1; i++ ){
            a[i] = a[i+1];
        }
        a[a.length-1]= temp;

        System.out.println(" New array is "+ Arrays.toString(a));


        int[] a2= {20,30,40,50};
        int temp1 = a2[a2.length-1];
        for(int i= a2.length-1 ; i>0 ;i--){
            a2[i] = a2[i-1];
        }
        a2[0]= temp1;

        System.out.println(" New array is "+ Arrays.toString(a2));


        //swap two String without 3 rd variable.

        String str1 ="abc";
        String str2 =" defg";
        String str3= str1.concat(str2);

        str2 = str3.substring(0, str3.length() - str2.length());

        str1 = str3.substring(str1.length());

        System.out.println(" str1 is "+ str1);
        System.out.println(" str2 is "+ str2);


        //panlindrome string

         String palindromeString ="madam";

         StringBuilder sb1 = new StringBuilder(palindromeString);
         StringBuilder reversedString = sb1.reverse();
         System.out.println(" reverse STring is "+ reversedString);

         System.out.println("reverse string is "+ reversedString.toString().equals(palindromeString));



         //reverse STring

        String inputSTring = " Happy Birthday Arpita";

        String[] words = inputSTring.split(" ");
        System.out.println(" here reverse String is ");

        for(String word: words){
            StringBuilder sb5 = new StringBuilder(word);

//            sb5.reverse();
            System.out.print(sb5.reverse().append(" "));
        }

        for( int i =0 ; i< words.length; i++){
            StringBuilder sb2 = new StringBuilder(words[i]);
            sb2.reverse();
            System.out.print(sb2.toString()+" ");
        }

        StringBuilder sb6 = new StringBuilder(inputSTring);
        String reversedInputString = sb6.reverse().toString();

        System.out.println(" here reverseinputSTring is "+ reversedInputString);




        //remove space frm STring

        String spaceRemovedSTring = " Happy Birthday Satya";

        String[] str5= spaceRemovedSTring.split(" ");

        for( String word: str5){
            System.out.print(word);
        }


        // aAbBcCdDeE

        String inputString5 ="aAbBcCdDeE";

        StringBuilder isUpperCase = new StringBuilder();
        StringBuilder isLowercase = new StringBuilder();


        char[] ch2 = inputString5.toCharArray();

        for( char ch1 : ch2){

            if(Character.isUpperCase(ch1)){
                isUpperCase.append(ch1);

            }

            if(Character.isLowerCase(ch1)){
                isLowercase.append(ch1);

            }
        }

        System.out.print(" uppercase letter is "+ isUpperCase);
        System.out.print(" lowercase letter is "+ isLowercase);

       //longest withput repeting chars
        String longestWithoutRepeating = "abcabcbb";

        int maxLength = 0;
        int left = 0;
        int right = 0;

        Set<Character> set = new HashSet<>();

        for (int i = right; i < longestWithoutRepeating.length(); i++) {

            while (set.contains(longestWithoutRepeating.charAt(i))) {
                set.remove(longestWithoutRepeating.charAt(left));
                left++;
            }

            set.add(longestWithoutRepeating.charAt(i));
            maxLength = Math.max(maxLength, i - left + 1);
            right++;
        }

        System.out.println("Max length of substring without repeating characters: " + maxLength);



//        int maxLength =0;
//        int left =0;
//        int right =0;
        int startIndex = 0;
//
//        Set<Character> set = new HashSet<>();

        for(int i = right ; i <longestWithoutRepeating.length()-1; i++){



           while(set.contains(longestWithoutRepeating.charAt(right))){
                set.remove(longestWithoutRepeating.charAt(left));
                left++;
            }

           startIndex= left;

            set.add(longestWithoutRepeating.charAt(right));
            right++;
            maxLength = Math.max(maxLength,right-left+1);



        }

        System.out.print(" longest Substring is "+ longestWithoutRepeating.substring(startIndex, maxLength));

          String countOfWOrds = "haooy Birthday Subhechha choudhury";
          int count =0;

          String[] cwordcount = countOfWOrds.split(" ");

          for(String word:cwordcount ){
              count++;
          }

          System.out.print(" count is "+ count);



          //permutation of string
        String inputPermutedString =" abc";

        permuteString(inputPermutedString,0,inputPermutedString.length()-1);

    }

    private static void permuteString(String str, int left, int right) {

        if(left ==right){
          System.out.print(str);
        }
        else{
            for (int i=left; i<=right ; i++){

                str = swap(str,left,i);
                permuteString(str,left+1,right);
                str= swap(str,left+1,right);
            }
        }
    }

    private static String swap(String str, int i, int j) {

        char[]  ch = str.toCharArray();
        char temp = ch[i];
        ch[i] =ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}
