public class reverseString {


    public static void main(String[] str){
        String Sentence = "Happy Birthday Satya";

        String[] words = Sentence.split(" ");

        String reverseSentence =" ";


        StringBuilder result =  new StringBuilder();

        for(int i = words.length-1; i>=0 ;i--){

            result.append(words[i]);
            result.append(" ");
        }
        System.out.print("my new logic "+ result);

        StringBuilder reversen= new StringBuilder();
        for(String word: words){
            StringBuilder Sb = new StringBuilder(word);
            reversen.append(Sb.reverse() +" ");

        }
        System.out.println(" reverse sen:" + reversen);


        /**
         * 1 approach
         */

//        for(String word: words){
//            StringBuilder sb = new StringBuilder(word);
//            sb.reverse();
////            System.out.print(sb.toString()+" "); // another use case
//
//            reverseSentence =reverseSentence+ sb.toString()+" ";
//        }

        /**
         * 2nd approach
         */

        for(String word: words){
            for(int i=word.length()-1 ; i>=0; i--){

               char reverseOWrd = word.charAt(i);
                reverseSentence = reverseSentence + reverseOWrd;

            }
            reverseSentence = reverseSentence + " ";
        }
        System.out.println(" reverse sentence is "+ reverseSentence);

        /**
         * another use case
         */
       for(int i= words.length-1 ;i>=0;i--){
//           reverseSentence += words[i]+" "; // another use case
           StringBuilder sb = new StringBuilder(words[i]);
           sb.reverse();
           reverseSentence = reverseSentence + sb.toString() + " ";

            }
        System.out.println("Reversed Sentence is: " + reverseSentence.trim());



       StringBuilder sb1 = new StringBuilder(Sentence);
       sb1.insert(2,"arpita"); // time complexity o(n)

       System.out.println(sb1.toString());

       sb1.deleteCharAt(2); // time complexity o(1)
       System.out.println("delete char is "+sb1.toString());

    }
}
