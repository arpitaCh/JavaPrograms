
public class ImpNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

/*
 * class A() { A(){ System.out.println("one"); }
 * 
 * public void mymethod() { this(); // from a method we cant call contructor ,
 * compile error System.out.println("two"); } }
 */

//check the constructor and constructor call during object creation
//Whether no of /type of parameters are matching or not,

/*
 * The code does not compile because the constructor of class A is declared as
 * private. This creates a problem when the subclass constructor makes an
 * implicit super() call to the parent class constructor at the time B is
 * instantiated
 */

