import java.util.Arrays;

public class DSA_String {

    public static void main(String[] str){

        String str1 = "wElcome to NVR";
        removeVowels(str1);
//        reversalOfString(str1);

//        convertUpperCaseToLowercase(str1);
    }

    private static void convertUpperCaseToLowercase(String str1) {

       System.out.println(str1.toLowerCase());
    }

    private static void reversalOfString(String str1) {

        char[] ch = str1.toCharArray();
        int i =0;
        int j = ch.length-1;

        while(i <j){
            if(ch[i] == 'e' || ch[i] == 'o'){
                if(ch[j] == 'e' || ch[j] == 'o'){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        System.out.println(ch);

    }



    private static void removeVowels(String str) {
        StringBuilder result = new StringBuilder();

//        char[] ch= str.toCharArray();
//
//        for(char ch: str.toCharArray()){
//            if(ch != 'a' || ch !='e' || ch !='i' || ch !='o' || ch!='u'){
//                result.append(ch);
//            }
//        }



        for( int i=0 ;i< str.length();i++){
            char ch = str.charAt(i);

            if(ch=='e' || ch=='o'){
                continue;
            }
            System.out.print(ch);

        }

//        System.out.println(result.toString());

    }
}
