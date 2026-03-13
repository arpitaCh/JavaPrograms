import java.util.Arrays;

public class leftRotationofArray {
    public static void main(String[] str) {

        int[] arr1 = {2, 3, 4, 5};
        int k = 3;
        leftRotationofArray(arr1, k);
    }

    public static void leftRotationofArray(int[] arr, int k) {

//        int n = arr.length;
//
//
//        for (int i = 0; i < k; i++) {
//            int first = arr[0];
//            for (int j = 0; j < n - 1; j++) {
//
//                arr[j] = arr[j + 1];
//
//            }
//            arr[n - 1] = first;
//        }
//
//        System.out.print(" array is " + Arrays.toString(arr));



        for (int i = 1; i <= k; i++) {
            int temp = arr[0];
            for (int j = 1; j <= arr.length-1; j++) {

                arr[j-1] = arr[j];
            }
            arr[arr.length - 1] = temp;
        }


        for(int i =0 ; i<=arr.length-1 ;i++){
            System.out.print(" left shft array is "+ Arrays.toString(arr));
        }
    }
}
