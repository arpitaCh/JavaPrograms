import java.util.Arrays;

public class PermutationOfGivenString {

	public static void main(String[] args) {
		String S = "ABC";

		int[] arr ={1,2,3};
		int n = S.length();
		System.out.println("=======Permute STring====== ");
		permuteString(S, 0,n-1);
//		System.out.println("======= without array format====== ");
//		permuteArray(arr, 0, arr.length-1);
//		System.out.println("======= with array format====== ");
//		permuteArrayWithFormatting(arr, 0, arr.length-1);

	}
	private static void permuteArray(int[] arr, int l, int r ) {

		if( l==r){
			for(int num: arr){
				System.out.print( num +" ");
			}
			System.out.println();
		}
		else{

			for(int i =l; i<= r ; i++){
				swapArray(arr, l,i);
				permuteArray(arr,l+1,r);
				swapArray(arr,l,i);
			}
		}
	}
	private static void permuteArrayWithFormatting(int[] arr, int l, int r ) {

		if( l==r){
			StringBuilder sb = new StringBuilder("[");

			for(int i = 0 ; i< arr.length ; i++) {
				sb.append(arr[i]);
				if (i < arr.length - 1) {
					sb.append(" ");
				}

			}
			sb.append("]");
			System.out.println(sb.toString());
		}
		else{

			for(int i =l; i<= r ; i++){
				swapArray(arr, l,i);
				permuteArrayWithFormatting(arr,l+1,r);
				swapArray(arr,l,i);
			}
		}
	}

	private static void permuteString(String str, int l, int r ) {

		if( l==r){
			System.out.println(str);
		}
		else{

			for(int i =l; i<= r ; i++){
				str= swapCharacter(str, l,i);
				permuteString(str,l+1,r);
				swapCharacter(str,l,i);


			}
		}
	}

	//swap ("ABC", 0,0)
//	permute("ABC",1,2)  -> swap("ABC,1,1)
	//permute (ABC,2,2) -> print ABC
	//backtract swap(ABC ,1,1 )

	public static String swapCharacter(String str, int l, int r) {
		char [] ch =str.toCharArray();
		char temp;
		temp = ch[l];
		ch[l]= ch[r];
		ch[r]= temp;
		return String.valueOf(ch);
	}

	public static void swapArray(int[] arr, int l, int r) {

	int temp = arr[l];
	arr[l] = arr[r];
	arr[r] = temp;
	}
}

//		String str = "ABC";
//		int n = str.length();
//		PermutationOfGivenString pms = new PermutationOfGivenString();
//		pms.permute(str, 0, n - 1);
//	}
//
//
//	private void permute(String str, int l, int r) {
//		if (l == r){
//			System.out.println(str);
//	}
//		else{
//		for (int i = l; i <= r; i++) {
//			str = swap(str, l, r);
//			permute(str, l + 1, r);
//
//			str = swap(str, l + 1, r);
//		}
//	}
//}
//
//	public String swap(String str, int l, int r) {
//		char [] ch =str.toCharArray();
//		char temp;
//		temp = ch[l];
//		ch[l]= ch[r];
//		ch[r]= temp;
//		return String.valueOf(ch);
//	}
//}
