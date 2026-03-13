import java.util.HashSet;
import java.util.LinkedHashMap;

public class longestSubStringWithoutRepeatingCharacter {

	public static void main(String[] args) {
	String s = "javaconceptoftheday";
//	lognestSubstring(s);

		int n  = s.length();
		int maxlen =0;
		int left = 0;
		int right =0;
		int startIndex = 0;

		HashSet <Character> set = new HashSet<Character>();

		while(right < n){

			char currntChar = s.charAt(right);
			if(!set.contains(currntChar)){
				set.add(currntChar);

				int windowLen = right -left +1;

				if(windowLen> maxlen){
					maxlen = windowLen;
					startIndex = left;
				}
				right++;

			} else{
				set.remove(s.charAt(left));
				 left++;
			}

		}



		System.out.println("result is "+ s.substring(startIndex,startIndex+maxlen));


	}
	
	static void lognestSubstring(String str) {
		
		int longestsubSTringlength = 0;
		String longestsubSTring = null;
		LinkedHashMap<Character, Integer>  lhs = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		int start = 0;

		for(int i =0;i<ch.length;i++) {
			
			char ch1= ch[i];

			if (lhs.containsKey(ch1)) {
				// Update the start to the next position after the last occurrence of the character
				start = Math.max(start, lhs.get(ch1) + 1);
			}

			lhs.put(ch1, i); // Store the index of the character
			if (i - start + 1 > longestsubSTringlength) {
				longestsubSTringlength = i - start + 1;

				// Build the substring from the current start to i
				StringBuilder sb = new StringBuilder();
				for (int j = start; j <= i; j++) {
					sb.append(ch[j]);
				}
				longestsubSTring = sb.toString();
			}
			
//			if(!lhs.containsKey(ch1)) {
//				lhs.put(ch1, i); // store index of character
//			}
//			else {
//				 i = lhs.get(ch1); // move the index to last occurence of character
//				 lhs.clear(); //clear the map to start a new substring
//				 lhs.put(ch1,i); // add current character back
//			}
//
//			if(lhs.size()> longestsubSTringlength) {
//				longestsubSTringlength = lhs.size();
//
//				StringBuilder sb = new StringBuilder();
//				for(Character key : lhs.keySet()) {
//					sb.append(key);
//				}
//				longestsubSTring = sb.toString();
//
		}
		
		
			

		System.out.println("input string"+str);
		System.out.println("longest sybstring" +longestsubSTring);
		System.out.println("longest sybstring" +longestsubSTringlength);
		
		
	}

}
