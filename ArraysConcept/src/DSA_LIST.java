import java.util.ArrayList;
import java.util.List;

public class DSA_LIST {

    public static  void main(String[] str){

        List<Integer> list=  new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
// remove even numbers
        for( int i =0; i<list.size(); i++){
            if (list.get(i)%2==0) {
                list.remove(i);
            }
        }
        System.out.println(" here list is "+ list);
    }
}
