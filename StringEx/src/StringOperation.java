
public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searchlastOccurence();
		deletchar(2);
		searchString();
	}
	
	//Searching last occurance
	
	public static void searchlastOccurence() {
		String str ="hello java , hello wored";
		System.out.println(str.lastIndexOf("hello"));
	}
	
	//remove a character from a particular position
	
	public static void deletchar(int position) {
		String str ="abcdds";
		System.out.println(str.substring(0,position)+str.substring(position+1));
	}
	
	//search a word inside a string
	public static void searchString() {
		String str ="abcdds  ghjjya hello";
		System.out.println("length of string is "+str.length());
		int index= str.indexOf("hello");
		if(index==-1)
			System.out.println("hello not found");
		else
			System.out.println("it got found at this index" +index);
	}
	

}
