import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeDuplicatesFromSortedArray {

    public static void main(String[] str){
         removeDuplicatesFromSortedArray();


    }

    private static void removeDuplicatesFromSortedArray(){
        int[] arr = {1,2,3,3,4,5,5,6};
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        System.out.print(set);

    }
}
