
public class Test1 {

	static int x ;
	int y;

	public Test1() {
		System.out.println("value of x" +this.x);
		System.out.println("value of y is " +y);
		staticMethod();
	}
	
	public static void Test1() {
		// compilation error here from static context we cant this keyword
//		System.out.println(this.x);
		System.out.println(x);
		
		//static method cant access non-static variable.
//		System.out.println("value of y " + y);
	}
	
	public static void staticMethod() {
		System.out.println("aaa");
	}

	public static void main(String[] args) {

		new Test1();
		Test1.Test1();
		
		
		String s1 = "Hello";
		 String s2 ="Hellow";
		 System.out.println(s1 =s2);
		 String s11 ="java";
		 String s22 ="java";
		 System.out.println(s11.equals(s22));
		 System.out.println(s11 ==s22);
		 System.out.println(s1.charAt(0) > s22.charAt(0));
		 int y=9;
		 System.out.println(y+s1+y);
	}

}
