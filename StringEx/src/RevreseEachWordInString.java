
public class RevreseEachWordInString {
	static String orginalword= "Happy Birthday Satya";
	static String[] str = orginalword.split(" ");
	static String reverseWord= " " ;
	public static void main(String[] args) {
	
		/**
		 *  Using stringBuilderConcept
		 */
	for(String singleword: str) {
		StringBuilder sb = new StringBuilder(singleword);
		sb.reverse();
		reverseWord= reverseWord+ sb.toString()+" ";
	}
	System.out.println( reverseWord);
	
	
		
		/**
		 * By using array -logic concept
		 */
		
	for (String singleword: str)	{
		
		for(int i= singleword.length()-1 ; i>=0;i--) {
			reverseWord = reverseWord +singleword.charAt(i);
		}
		reverseWord = reverseWord +" ";
		
	}
	System.out.println(reverseWord);
		
		
	}
	

}
