public class inheritenceConcept {

	public static void main(String[] args) {
		x xx = new x();
		System.out.println(xx.area(5, 4));
		xx.printname();
	}
}

class y {
	public int area(int length, int width) {
		return length * width;
//		System.out.println(length * width);
	}

	private void printname() {
		System.out.println("a");
	}
}

class x extends y {
	public int area(long length, long width) {
		return (int) Math.pow(length, 2);
	}

	public void printname() {
		System.out.println("b");
	}
}
