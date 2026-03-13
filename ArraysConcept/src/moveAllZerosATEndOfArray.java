//Move all zeros to end of array
//Last Updated : 06 Aug, 2025
//Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.
//
//Examples:
//
//Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
//Explanation: There are three 0s that are moved to the end.
//
//        Input: arr[] = [10, 20, 30]
//Output: arr[] = [10, 20, 30]
//Explanation: No change in array as there are no 0s.
//
//        Input: arr[] = [0, 0]
//Output: arr[] = [0, 0]
//Explanation: No change in array as there are all 0s.

import sun.lwawt.macosx.CSystemTray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class moveAllZerosATEndOfArray {

    public static void main(String[] str){
        int[] arr1= {1,3,0,7,0,9,0,7,0,2};
        moveAllZerosATEndOfArray(arr1);
    }

    public static void moveAllZerosATEndOfArray(int[] arr){

        Stack<Integer> Zerostack = new Stack<>();
////        Stack<Integer> numberStack = new Stack<>();
//          for(int i =0 ;i<arr.length;i++ ){
//              if (arr[i] == 0) {
//                  Zerostack.push(arr[i]);
//              }
////              else{
////                  numberStack.push(arr[i]);
////              }
//          }
//
//     for(int i =0 ;i<arr.length;i++ ){
//
//         System.out.print(arr[i]+" ");
//     }
        // Convert int[] to Integer[]
//        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        //convert int[] to List<Integer>
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

//      List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));

        // Create a new list to store the result
        List<Integer> result = new ArrayList<>();
        int zeroCount = 0;

      for(int num:list){
          if (num != 0) {
              result.add(num);
          } else {
              zeroCount++;
          }
      }

        // Append zeros to the end
        for (int i = 0; i < zeroCount; i++) {
            result.add(0);
        }

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }






    }
}
