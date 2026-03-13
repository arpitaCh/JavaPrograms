
public class palindromeNoAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 121;
		int num= 0;
		num = num1;
		int reverse = 0;
		while (num != 0) {
			int r = num % 10;
			reverse = reverse * 10 + r;
			num = num / 10;

		}
		if (num1 == reverse) {
			System.out.println("its palindrome");
		}
		else {
			System.out.println("not");
		}
		
	}

}
