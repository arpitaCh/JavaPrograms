
public class inheritence2 {

	public static void main(String[] args) {

		new B(5);
	}

}

class A {
	A() {
		System.out.println("a");
	}

	public A(int i) {
		this();
		System.out.println(i);

	}
}

class B extends A {
	B() {
		System.out.println("b");
	}

	public B(int i) {
		this();
		System.out.print(i + 3);
	}
}
