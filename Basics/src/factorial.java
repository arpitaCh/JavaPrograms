import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = S.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of a given number is " + fact);

		
		System.out.println("write using recursion");
		
		System.out.print(fact1(6));
	}
	public static int fact1(int n1) {
		if(n1 ==1)
		 return 1;
		else
		 return n1*fact1(n1-1);
	}

}
