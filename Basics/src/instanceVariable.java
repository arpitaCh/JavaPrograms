//instance area -> 

//void m1 () { instance method
//	body = instance area
//}

//static area -> 
//static void m1() {
//	
//}

//variable are declared inside class but outside method ,constructor ,block 
//scope is inside the class all method , block and constructor  can access .
//memory allocated when object created and memory destroyed when object destryoed 
//stored in heap memory .

public class instanceVariable {
	// instance variable
	int a = 10;
	int b = 20;

//static method below
	public static void main(String[] args) {
		// static area .
		instanceVariable t = new instanceVariable();
		System.out.println("static "+ (t.a + t.b));
		t.m1();
	}

	// instance block
	 void m1() {
	// instance area

		System.out.println( "instance" +( a + b));
	};

}
