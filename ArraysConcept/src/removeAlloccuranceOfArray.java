import java.util.Arrays;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class removeAlloccuranceOfArray {

    public static void main(String[] str){

        removeAllOccurance();
    }

    private static void removeAllOccurance() {

        int[] arr = {2,3,0,8,9,9,8};
        int[] arr1 = new int[arr.length];
        int k = 0;
        int j =0;

        for(int i =0 ; i<=arr.length-1; i++){

            if(arr[i]!=k){

                arr1[j++] =arr[i];

            }
        }

        arr1= Arrays.copyOf(arr1,j);
        System.out.print("new array is "+ Arrays.toString(arr1));
    }
}
