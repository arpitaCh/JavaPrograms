import java.util.*;

public class CollectionInterview {



    public static void main(String[] str){

        removeDuplicate();
//        groupingItemUsingMap();
    }

    //    Removing duplicates from a list
    private static void removeDuplicate() {

        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("cghd");
        list.add("sub");
        list.add("sb");
        list.add("sub");

        Set<String> set = new LinkedHashSet<>(list);

        List<String> removedDuplicatedList = new ArrayList<>();
        removedDuplicatedList.addAll(set);
        System.out.println(" here set is "+ set);

        System.out.println(" here list is "+ removedDuplicatedList);


    }

    //grouping items using map

    private static void groupingItemUsingMap(){

        String[] str= {"apple", "banana", "avocado", "blueberry", "cherry" ,"apple", "banana"};

//        Map<Character,List<String>> map = new HashMap<>();

//        for(String word: str){
//
//            char key = word.charAt(0);
//
//         map.computeIfAbsent(key,k-> new ArrayList<>()).add(word);
//
//        }
//        for(Map.Entry<Character,List<String>> entry : map.entrySet()){
//            System.out.println( entry.getKey() +":"+ entry.getValue());
//
//        }

//        Map<Character, List<String>> grouped = new HashMap<>();
//        for(String word: str) {
//            char key = word.charAt(0);
//            if (!grouped.containsKey(key)) {
//                grouped.put(key, new ArrayList<>());
//            }
//            grouped.get(key).add(word);
//        }
//
//        for(Map.Entry<Character,List<String>> entry : grouped.entrySet()){
//            System.out.println( entry.getKey() +":"+ entry.getValue());
//
//        }

        Map<String, List<String>> grouped = new HashMap<>();
        for(String word : str){
            grouped.computeIfAbsent(word, k-> new ArrayList<>()).add(word);
        }
        for(Map.Entry<String,List<String>> entry : grouped.entrySet()){
            System.out.println(entry.getKey() + ":"+ entry.getValue());
        }



    }



}
