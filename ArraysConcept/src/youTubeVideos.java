public class youTubeVideos {
    public static void main(String[] str){

        int[] a= {1,2,3,4,5,6,7};

        String str1= " This is doing and rocking and going good thing";

        for(int i =0 ;i< a.length;i++){
//            System.out.println(Math.sqrt(a[i]));
//            System.out.println(Math.pow(a[i],3));
        }

        String[] str2= str1.split(" ");
//        for(int i =0 ;i< str2.length; i++){

//            if(str2[i].contains("ing")){
//                System.out.print(str2[i] +" ");
//            }

//            System.out.print(str2[i].substring(0));

//        }
        for(int i =0 ;i< str2.length; i++){
            if (str2[i].length() > 1) {
                char firstCh = str2[i].charAt(0);
                int len = str2[i].length();
                char lastCh = str2[i].charAt(len - 1);
                String middleWord = str2[i].substring(1, len - 1);
                System.out.print(lastCh + middleWord + firstCh + " ");
            } else {
                // For single-character words, just print the word
                System.out.print(str2[i] + " ");
            }
        }



    }
}
