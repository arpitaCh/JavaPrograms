import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class permutationOfArray_LeetCode {

    public static void main(String[] str){

        int[] a = {1,2,3};
//        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> result = permutationOfArray(a);

    }

    private static List<List<Integer>> permutationOfArray(int[] a) {
        List<List<Integer>> result = new ArrayList<>();
        int index = 0 ;
        getpermutation(a, index,result );
        return result;
    }

    private static void getpermutation(int[] a, int index, List<List<Integer>> result) {

        if( index == a.length){
            result.add(a);
        }

        for(int i = index ; i<= a.length; i++){

            swap(a, index, i );
            getpermutation(a, index+1,result);

            swap(a, index, i );

        }
    }

    private static void swap(int[] arr, int i, int i1) {

        int temp = arr[i];

        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
