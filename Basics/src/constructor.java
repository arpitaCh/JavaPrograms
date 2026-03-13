//hashcode concept.
//Default value of static variable is 0, null, false. 
//contructor cant be be static ,will throw compilation probelm
//contsructor cant be final, compilation error .
//super keyowrd must be first statement.

//public int display(int x, int y){
//return("The sum of x and y is " +x +y); return type int , returning string , compile error.
//}
public class constructor {
public static int $x;
static String s;

	int i;
	int j;
	constructor(){
		 i=1;
		 j=2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor obj1= new constructor();
constructor obj2= new constructor();
System.out.println(obj1.equals(obj2));
System.out.println("value of s is "+ s);
System.out.println("value of x is "+ $x);
		
	}

}
