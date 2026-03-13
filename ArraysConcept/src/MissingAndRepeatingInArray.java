import java.util.HashMap;
import java.util.Map;

public class MissingAndRepeatingInArray {
    
    public static void main(String[] str){
        int[] arr = {1, 2, 3, 5, 5};
        findMissingAndRepeating(arr);
    }

    private static void findMissingAndRepeating(int[] arr) {


        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

//        String keyset= map.keySet().toString();

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println("repeating number is "+ entry.getKey());
            }
        }


    }
}
