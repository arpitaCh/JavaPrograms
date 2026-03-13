import java.util.ArrayList;
import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;

public class RemoveSpecificElementFromAnArray {

	public static void main(String[] args) {
		String[] arrayBeforeRemoval =  { "a", "b", "c", "f" };
//		String[] arrayAFterRemoval = ArrayUtils.remove(arrayBeforeRemoval, "c");
//		System.out.println(arrayAFterRemoval);
		// remove a elemnet at specfific index using ArrayUtils class :
//		String[] arrayAFterRemoval = ArrayUtils.remove(arrayBeforeRemoval, 2);
		
//		Remove Multiple Elements At Different Indices From An Array
//		String[] arrayAFterRemoval = ArrayUtils.removeAll(arrayBeforeRemoval, 2,4,5);
		
//		Remove Multiple Specific Elements From An Array
//		String[] arrayAfterRemoval = ArrayUtils.removeElements(arrayBeforeRemoval, "Two", "Four", "Six");
	
//      Remove All Occurrences Of An Element From An Array
//		String[] arrayAfterRemoval = ArrayUtils.removeAllOccurences(arrayBeforeRemoval, "Two")
	
	ArrayList<String>  al = new ArrayList<String> (Arrays.asList(arrayBeforeRemoval));
	System.out.println("al is " + al);
	al.remove(2);
	
	for(String s:al) {
		System.out.println(s);
	}
	
		
	
	}

}
