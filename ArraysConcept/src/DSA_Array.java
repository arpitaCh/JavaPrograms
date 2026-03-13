import java.util.Arrays;

public class DSA_Array {

    public static void main(String[] str){

        int[] a = {1,2,3,4};
        int shiftCount = 5;
//        sumArray(a);
//        maxArray(a);
//        reverseArray(a);
//        subArrayOfArray(a);
          shiftArray(a, shiftCount);



    }

    private static void shiftArray(int[] a, int shiftCount) {
        int n = a.length;
        shiftCount= shiftCount % n;
        int[] leftShiftArray = new int[n];
        int[] rightShiftArray= new int[n];

        //left shift
        for(int i =0 ; i< n ;i++){
            leftShiftArray[(i+shiftCount)%n]= a[i];
        }
        System.out.println(Arrays.toString(leftShiftArray));


        //right shift
        for(int i=0; i<n ;i++){
            rightShiftArray[(i-shiftCount +n) %n] = a[i];
        }
        System.out.println(Arrays.toString(rightShiftArray));

    }

    private static void subArrayOfArray(int[] a) {
        int n = a.length;

       for(int si = 0 ; si <n ;si++){
           for(int ei= si ; ei <n ; ei++){

               for(int k =si ; k <=ei ;k++){
                   System.out.print(a[k]+" ");
               }
               System.out.println();
           }
       }
    }

    private static void reverseArray(int[] a) {
     int[] reverseArray =new int[a.length];
        for(int i= 0; i<a.length;i++){
            reverseArray[a.length-1-i]= a[i];
        }
//        int j=0;
//        for(int i=a.length -1; i>=0 ;i--){
//            System.out.println(" here i is "+ i + a[i]);
////            reverseArray[j++]= a[i];
//
//        }
        System.out.println(" reverse Array is "+ Arrays.toString(reverseArray));
    }

    private static void maxArray(int[] a) {

        int max=0;
        for(int i=0; i<a.length;i++){
            if(a[i]> max) {
                max = a[i];
            }
        }

        System.out.println(" here max num is "+ max);
    }

    private static void sumArray(int[] a) {
        int sum=0;
        for(int i=0 ;i< a.length; i++){
            sum+=a[i];
        }

        System.out.println(" here sum is "+ sum);

    }
}
