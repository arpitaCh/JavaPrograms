
public class printAllSubStringinAString {

	public static void main(String[] args) {
		String s = "code";
		for(int i =0; i<=s.length(); i++) {
//			System.out.println( "value of i " +i);
			for(int j =0;j<i;j++) {
			System.out.println(s.substring(j,i));
			}
		}
		int count =0;
		String s1= "satya";
		for(int i=0;i<s1.length();i++) {
		if((s1.charAt(i) =='t') && (s1.charAt(i+1)=='y')) {
				count ++;
			}
		}
		
		
//		String swapchar(String str,int i,int j) {
//			char[] charArray = str.toCharArray();
//			char temp;
//			temp=charArray[i];
//			charArray[i] = charArray[j];
//			charArray[j] = temp;
//			return String.valueOf(charArray);
//
//		}
//		String s2 ="arpita";
//
//		for(int i1 =0; i1<s2.length();i1++) {
//			for(int j1= 1;j1 >=i1;j1--) {
//				swapchar(s2,i1,j1)
//			}
//		}
//		System.out.println("count is " +count);
		
	}

}
