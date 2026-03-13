package linkhashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstRepetedAndNonRepetedCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "arpita";
		getFirstRepetedAndNonRepetedChar(s);
		
	}
	
	static void  getFirstRepetedAndNonRepetedChar(String s1) {
		
		HashMap<Character, Integer> hs = new HashMap<Character, Integer> ();
		char[] ch = s1.toCharArray();
		
		for(char ch1:ch) {
			
			if(hs.containsKey(ch1)) {
				hs.put(ch1,hs.get(ch1)+1);
			}
			else {
				hs.put(ch1, 1);
			}
		}
		
	for(char c:ch) {
		if(hs.get(c) ==1) {
			System.out.println("First Non repeted char " +c);
			break;
		}
	}
	
	for(char c:ch) {
		if(hs.get(c) >1) {
			System.out.println("First  repeted char " +c);
			break;
		}
	}
	
		
		
	}

}
