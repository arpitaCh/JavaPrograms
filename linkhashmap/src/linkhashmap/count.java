package linkhashmap;

import java.util.HashMap;

public class count {

	public static void main(String[] args) {
	
		String str= "this is alive";
		
		HashMap<Character, Integer> hs= new HashMap<Character, Integer>();
		
		char[] ch= str.toCharArray();
		
		for (char ch1: ch) {
			if(hs.containsKey(ch1)) {
				hs.put(ch1, hs.get(ch1)+1);
			}
			else {
				hs.put(ch1, 1);
			}
		}
		System.out.println(hs);
		

	}

}
