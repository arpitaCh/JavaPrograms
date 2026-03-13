import java.util.Comparator;
import java.util.TreeSet;

public class CustomisedSortingUsingComparatorInTreeset {

	public static void main(String[] args) {
		TreeSet<String> t1= new TreeSet<String>(new Mycomp());
		// TODO Auto-generated method stub
        t1.add("fhfhjfhj");
        t1.add("tyy");
        t1.add("789");
        t1.add("iiko99");
        System.out.println(t1);
	}
}
	class Mycomp implements Comparator<String>{
		public int compare(String s1, String s2) {
			return  -s1.compareTo(s2);
		}
}
