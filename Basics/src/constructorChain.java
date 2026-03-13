
public class constructorChain {
 
	public static void main(String[] args) {
		 M m = new C();
		 m.eat(m);
		 m.drink();
		 N n = new C();
		 n.eat(n);
		 n.drink();
		 n.eat(m);
		 
		 
		
	}
}

class M{
	void eat(M a) {
		System.out.println("abc");
	}
	void drink() {
		System.out.println("xyz");
	}
}

class N extends M{
	 void eat(N b) {
		 System.out.println("def");
	 }
	 void drink() {
			System.out.println("pqr");
		}
}

class C extends N{
	void eat(C c) {
		 System.out.println("fgh");
	}
	
	void drink() {
		System.out.println("mno");
	}
}