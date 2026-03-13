import java.util.ArrayList;
import java.util.List;

//LeetCode problem
public class printAllSubSets_Leetcode {

    public static void main(String[] str){

        int[] a= {1,2,3};
       List<List<Integer>> subsetList= printAllSubSets(a);

       System.out.println(" here sub set list "+ subsetList);
    }

    public static List<List<Integer>> printAllSubSets(int[] arr){
        List<Integer> currentSubSet = new ArrayList<>();
        List<List<Integer>> subsetList = new ArrayList<>();
//        subset.add(new ArrayList<>());
        int i = 0;
        getAllSubStr(arr,subsetList,currentSubSet,i);
         return subsetList;
    }

    private static void getAllSubStr(int[] arr, List<List<Integer>> subsetList, List<Integer> currentSubSet, int i) {

         if( i== arr.length){
             subsetList.add(new ArrayList<>(currentSubSet));
             return;
         }

        currentSubSet.add(arr[i]);
        getAllSubStr(arr, subsetList,currentSubSet,i+1);
        currentSubSet.remove(currentSubSet.size()-1);
        getAllSubStr(arr, subsetList,currentSubSet,i+1);




    }
}
