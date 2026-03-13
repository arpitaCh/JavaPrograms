package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class FindCommonElementFrom2Array {

    public static void main(String[] str) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                System.out.println(arr2[i]);

            }
        }


        // when duplicates avaulable in array

        int[] arr3 = {3, 4, 5, 6, 6};
        int[] arr4 = {3, 4, 3};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> commonElement = new HashSet<>();


        for (int num : arr3) {
            set.add(num);
        }
        for (int num : arr4) {
            if (set.contains(num)) {
                commonElement.add(num);
            }
        }
        System.out.println(" commomelements are " + commonElement);

    }
}
