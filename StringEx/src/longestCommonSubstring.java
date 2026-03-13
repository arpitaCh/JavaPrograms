public class longestCommonSubstring {

    public static void main(String[] str){

        String[] str2 = { "flower", "slow", "glow"};
        String longCommonString= longestCommonSubstring(str2);
        System.out.println(" longCommonString is "+ longCommonString);

    }


    public static  String longestCommonSubstring (String[] str){

        String ShrtString = str[0];

        int length= ShrtString.length();

        for(String str2: str){

            if(str2.length()< ShrtString.length()){

                ShrtString= str2;
            }
        }

        System.out.println(" shortest String " +ShrtString +" and length is "+ ShrtString.length());



        //genrate all substring

        String longest = "";
        for(int i = 0 ; i < ShrtString.length(); i++){

            for( int j = i+1; j<= ShrtString.length(); j++){

                String sub = ShrtString.substring(i,j);

                boolean foundAll = true;

                for(String s : str){
                    if(!s.contains(sub)){
                        foundAll = false;
                        break;
                    }

                }

                if(foundAll && sub.length() > longest.length()){
                    longest = sub;
                }

            }
        }

        return longest;

    }
}
