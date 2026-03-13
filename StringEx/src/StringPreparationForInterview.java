import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPreparationForInterview {


    public static void main(String[] str) {
        String str1 = "Arpita Chpaittaraj";

        //reverse String

//        reverseString(str1);

        //find first Non repeating characters

        findFirstNonRepetngCharacter(str1);

        //parse log and extract error message

//        String logMessage ="[INFO] Login failed with code ERR1023 at 13:45";
//        parseAlogAndExtractErrorMessage(logMessage);


//        Detect Duplicate Words in a Sentence

//        String DeleteDuplicateWord= "this is a space is complex";
//        DeleteDuplicateWordFromSentence(DeleteDuplicateWord);

        //string compression

        String strungcople = "aaabbccccffcc";
        String compressedString = StringCompression(strungcople);
        System.out.println("compressed string is " + compressedString);

//        String st1r = "automationtesting";

//        findMostRepetngCharacter(st1r);

        // convert camel case to snake case

//        String st2r = "TestCaseSample";
//        convertCamelCaseToSnakeCase(st2r);

        String str3 = "remmveeeeConsecutiveDuplicate";
//        removeConsecutiveDuplicate(str3);
        removeConsecutiveDuplicateWIthKRepetionRemoveAllOccurance(str3, 3);

    }

    private static String DeleteDuplicateWordFromSentence(String deleteDuplicateWord) {

        String[] words = deleteDuplicateWord.split(" ");
        // in normal hashset it wont maintain order. Linked hashset will maintain order
        Set<String> hashSet = new LinkedHashSet<>();

        for (String word : words) {
            hashSet.add(word);
        }
        System.out.println(" value is" + String.join(" ", hashSet));
        return String.join(" ", hashSet);

    }

    public static String StringCompression(String str) {

//        char[] ch = str.toCharArray();
//
//        Map<String,Integer> map = new HashMap<String,Integer>();
//        for (char ch1: ch){
//            map.put(String.valueOf(ch1), map.getOrDefault(ch1,0)+1);
//        }

//        return str;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static String parseAlogAndExtractErrorMessage(String logMessage) {
        Pattern pattern = Pattern.compile("ERR\\d+");
        Matcher matcher = pattern.matcher(logMessage);

        if (matcher.find()) {
            System.out.println(" here matcher is " + matcher.group());
            return matcher.group();
        } else
            return "No error code found";
    }

    public static String reverseString(String str) {
        String[] words = str.split(" ");

        StringBuilder reverseString = new StringBuilder();
        StringBuilder reverseWord = null;
        for (String word : words) {
            reverseWord = new StringBuilder(word);
            reverseWord.reverse();
            reverseString.append(reverseWord).append(" ");
        }

        return reverseString.toString();
    }


    public static void findFirstNonRepetngCharacter(String str) {

        String str2 = str.toLowerCase();
        char[] ch = str2.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();


        for (char ch1 : ch) {
            if (ch1 != ' ') {
                map.put(ch1, map.getOrDefault(ch1, 0) + 1);
            }
        }
        System.out.println(" print map" + map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(" here value is " + entry.getKey());
                break;
            }
        }
    }

    public static void findMostRepetingCharacter(String str) {
        String str2 = str.toLowerCase();
        char[] ch = str2.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();


        for (char ch1 : ch) {
            if (ch1 != ' ') {
                map.put(ch1, map.getOrDefault(ch1, 0) + 1);
            }
        }

        char mostFrequentChar = 0;
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }

        }
        System.out.println("Most frequent character: '" + mostFrequentChar + "', count: " + maxCount);
    }


    public static void convertCamelCaseToSnakeCase(String str) {

        System.out.println(" camel case is " + str.replaceAll("([A-Z])([a-z])", "$1_$2").toLowerCase());
    }

    public static String removeConsecutiveDuplicate(String str) {
        char[] ch = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        char previousCharacter = str.charAt(0);
        sb.append(previousCharacter);
        for (int i = 1; i < ch.length; i++) {

            char currentChar = str.charAt(i);
            if (currentChar != previousCharacter) {
                sb.append(currentChar);
                previousCharacter = currentChar;
            }

        }
        System.out.println(" here modifiled string is " + sb.toString());
        return sb.toString();


    }


    public static String removeConsecutiveDuplicateWIthKRepetionRemoveAllOccurance(String str, int repetcount) {


        char[] ch2 = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        char previousCharacter = str.charAt(0);
        sb.append(previousCharacter);
        for (int i = 1; i < ch2.length; i++) {

            char currentChar = str.charAt(i);
            if (currentChar != previousCharacter) {
                sb.append(currentChar);
                previousCharacter = currentChar;
            }

        }

        String modifiedString = sb.toString();
        char[] ch = modifiedString.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch1 : ch) {

            map.put(ch1, map.getOrDefault(ch, 0) + 1);
        }


        StringBuilder sb2 = new StringBuilder();

        for (char c : ch) {
            if (map.get(c) != repetcount) {
                sb2.append(c);
            }

        }
        System.out.println(" here modufiled string is " + sb2.toString());
        return sb.toString();


    }

    public int findIndexOfOccurance(String haystack, String needle) {

        if (haystack.contains(needle)) {
            int index = haystack.indexOf(needle);
            return index;
        } else {
            return -1;
        }

    }

    public int findIndexOfOccuranceWIthAnotherApproach(String haystack, String needle) {


        for(int i =0 ; i< haystack.length() ; i++){

            char ch= haystack.charAt(i);
            char ch2 = needle.charAt(0);

            if(ch== ch2){
                if((haystack.substring(i,needle.length()+i)).equals(needle)){
                    return i;
                }
                else{
                    return -1;
                }
            }
            else{
                return -1;
            }
        }


        return 0;
    }
}

