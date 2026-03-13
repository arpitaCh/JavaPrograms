
public class RightTraingle {
 
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i= 1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("patteren programming with space consideration");
		
		for(int i=1;i<=4;i++) {
			for(int j =3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("patteren programming with space and traingle both consideration");
	
		for(int i=1;i<=4;i++) {
			for(int j =3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			for(int m=2;m <=i ;m++){
			System.out.print("*");
		}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i*2;k--) {
				System.out.print("*");
			}
			
			for(int m=2;m >i ;m--){
			System.out.print("*");
		}
			System.out.println();
		}
		
		
		System.out.println("diamond patern");
		
		for(int i =1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print( i+" ");
			}
			System.out.println();
		}
		
		for(int i =1;i<=3;i++) {
			for(int j=1;j<=i ;j++) {
				System.out.print(" ");
			}
			
			for(int k=3;k>=i;k--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("patteren programming with space consideration practice");
	
		for(int i =1;i<=4;i++) {
			for(int j =3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k =1; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
			
		}
	}

}
