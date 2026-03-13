package linkhashmap;

import java.util.HashMap;
import java.util.Map;

public class countOccurenceOfEachcharacater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Alive is awesome Alive alive";
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		char[] ch = input.toCharArray();
		for (char ch1 : ch) {
			if (hs.containsKey(ch1)) {
				hs.put(ch1, hs.get(ch1) + 1);
			} else {
				hs.put(ch1, 1);
			}
		}
		System.out.println("character count " + hs);

		int repetcount = 0;
		for (char ch2 : ch) {
			if (hs.get(ch2) == 1) {
				System.out.println("Non repeated char is " + ch2);
				repetcount++;
				if (repetcount == 2) {
					break;
				}
			}
		}
		for (Map.Entry<Character, Integer> ch2 : hs.entrySet()) {
			System.out.println(ch2.getKey() + " value " + ch2.getValue());
		}

		HashMap<String, Integer> hs1 = new HashMap<String, Integer>();
		String[] words = input.split(" ");
		for (String word : words) {
			if (hs1.containsKey(word)) {
				hs1.put(word, hs1.get(word) + 1);
			} else {
				hs1.put(word, 1);
			}
		}
		System.out.println("words count " + hs1);

	}

}
