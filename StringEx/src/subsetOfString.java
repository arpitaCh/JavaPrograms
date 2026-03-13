import java.util.Scanner;

public class subsetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindSubset("wxyz");


//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a string:");
//		String input = scanner.nextLine();
//
//		boolean hasLetter = false;
//		boolean hasDigit = false;
//
//		for (char ch : input.toCharArray()) {
//			if (Character.isLetter(ch)) {
//				hasLetter = true;
//			}
//			if (Character.isDigit(ch)) {
//				hasDigit = true;
//			}
//			if (hasLetter && hasDigit) {
//				break;
//			}
//		}
//
//		if (hasLetter && hasDigit) {
//			System.out.println("The string contains both letters and numerals.");
//		} else {
//			System.out.println("The string does not contain both letters and numerals.");
//		}
//
//		scanner.close();
//	}
//}

	}
	
	public static void FindSubset(String s) {
//		for(int i=0 ;i<s.length();i++) {
//			for(int j=i;j<s.length();j++) {
//				System.out.println(s.substring(i,j+1));
//			}
//			
//		}
		
		for(int i =0 ;i<s.length();i++) {
			for(int j =i;j<s.length();j++) {
				System.out.println(s.substring(i,j+1));
			}
		}
		
	}

}
