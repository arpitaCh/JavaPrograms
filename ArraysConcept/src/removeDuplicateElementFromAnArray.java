import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class removeDuplicateElementFromAnArray {

	public static void main(String[] args) {
		
			

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

		
//		removeDuplElement(al);
	}

	static void removeDuplElement(ArrayList<Integer> li) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(li);
		Set<Integer> set = new HashSet<Integer>(al);
//		Iterator<Integer> itr = set.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		System.out.println("set is"+ set);

	}

}
