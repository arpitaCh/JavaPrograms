import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class RemveAllOccurenceOfAnElementArray {
//
//	public static void main(String[] args) {
//		
//		int [] a = {1,3,4,5,3 ,6,7,8 ,5,6,7};
//		int key =3;
//		
//		removethree(a,key);
//
//
//	}
//
//	public static void removethree(int[] array ,int key) {
//	List<Integer> li = new ArrayList<Integer>();
//		for(int ele:array) {
//			if(ele!=key) {
//			li.add(ele);
//			}
//		}
//		System.out.println("new list" +li);
//	}
//}

public class RemveAllOccurenceOfAnElementArray {
	
	public static void main(String[] str) {
		int[] a = {1,3,4,5,6,7,7,7};
		int key= 7;
		removeElement(a,key);
	}
	
	public static void removeElement(int[] array, int key) {
		List<Integer> li = new ArrayList<Integer>();
		for(int ele: array) {
			if(ele!= key)
				li.add(ele);
			
		}
		System.out.println(li);
	}
}
