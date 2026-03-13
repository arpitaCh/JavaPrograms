public class longestCommonPrefix {

    public static void main(String[] str) {
        String[] words = {"flower", "flow", "flight"};
        longestCommonPrefix(words);
    }



    public static String longestCommonPrefix(String[] words) {


        for (int i = 0; i < words[0].length(); i++) {

            char c = words[0].charAt(i);

            for (int j = 1; j < words.length; j++) {
                System.out.println( " value of i is"+ i+ "and "+ words[j] +" char is "+ words[j].charAt(i));
                if (i == words[j].length() || words[j].charAt(i) != c) {
                    System.out.print("common is "+words[0].substring(0,i) );
                    return words[0].substring(0,i);
                }
            }


        }
        return words[0];
    }
//        String str1= "hello";
//        String str2 ="hel";
//
//        System.out.println(str1.indexOf(str2));
}
