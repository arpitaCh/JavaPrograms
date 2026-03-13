package lamdaExp;

interface it{
	void disp();
}

interface   it1{
	String disp(int a);
}

public class Test1 {

	public static void main(String[] args) {
		it i1= new it() {
			public void disp() {
				System.out.println("This is annonymous class...");
			};
		};
		i1.disp();
		
		
		it i2= () ->{
			System.out.println("this is lamda1...");
			System.out.println("this is lamda2...");
		};
		i2.disp();
	
	
	
	
	// now lamda expression with some arguments:
	
	it1 it11= (a) -> {
		System.out.println("the name of String is good morning");
		return "done";
	  };
	  String str= it11.disp(100);
	  System.out.println("the string is " +str);
	}
}
