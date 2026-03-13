//the variables which are declared inside the class , outside the method with static modifier its static variable .
//when .class files loading , static variables memory allocated
//scope is within the class , it is accessible from anywhere in the class .
//we can access static variable or static methods by using class name
//stored in nonheap memory
public class staticvariable {
static int a = 100;
static int b =100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(staticvariable.a);
System.out.println(staticvariable.b);
staticvariable st= new staticvariable();
st.m1();
	}
	
	 void m1() {
		System.out.println(staticvariable.a);
	}

}
