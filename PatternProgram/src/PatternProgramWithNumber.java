
public class PatternProgramWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 signle pattern 
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//2 signle pattern 
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i =6;i>=1;i--) {
			for(int j =1 ;j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
		//3 signle pattern 
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		//4 signle pattern 
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i = 6; i >=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		//5 th pattern 
		for(int i = 1;i<=7 ;i++) {
			for(int j =7 ;j>=i;j--) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
		//6 th pattern 
		System.out.println("6th pattern");
		for(int i = 7; i>=1 ;i--) {
			for(int j =1 ;j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

}
