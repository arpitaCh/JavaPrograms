package linkhashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getMostFrequnetElement(new int[] {1,3,4,5,6,7,6,7,7});
	}

	
	static void getMostFrequnetElement(int[] inputArray) {
		HashMap<Integer, Integer> hs= new HashMap<Integer,Integer>();
		for(int i:inputArray) {
			if(hs.containsKey(i)) {
				hs.put(i,hs.get(i) +1);
			}
			else {
				hs.put(i,1);
			}
		}
		
		int element =0;
		int frequnecy=0;
//
		Set<Entry<Integer,Integer>> set = hs.entrySet();
		for(Entry<Integer,Integer> entry: set) {
			if(entry.getValue()> frequnecy) {
				 element = entry.getKey();
				 frequnecy =entry.getValue();

				 System.out.println(" key and counyt is"+ element + frequnecy);
			}
		}

		System.out.println(" frequent element is "+ element + "its freq" + frequnecy);
//		if(frequnecy>1) {
//			System.out.println("The most frequent elemnt"+ element +" and frqunecy is "+frequnecy);
//		}
		
		
	}
}
