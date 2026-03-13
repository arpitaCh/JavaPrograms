
public class variableConcept {

	/*
	 * int instancevariable1 = 100; int instancevariable2 = 200;
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * m1(); m2(); }
	 * 
	 * static void m1() { variableConcept obj = new variableConcept();
	 * System.out.println(obj.instancevariable1);
	 * System.out.println(obj.instancevariable2); }
	 * 
	 * static void m2() { variableConcept obj = new variableConcept();
	 * System.out.println(obj.instancevariable1);
	 * System.out.println(obj.instancevariable2); }
	 */
	
	
//	assignment2 :
	int instancevariable1 = 100;
	int instancevariable2 = 200;
	static int staticvariable1 = 50;
	static int staticvariable2= 70;
	
	void m1 () {
		variableConcept obj1= new variableConcept();
		System.out.println(instancevariable1);
		System.out.println(instancevariable2);
		System.out.println(obj1.staticvariable1);
		System.out.println(obj1.staticvariable2);
	}
	
	static void m2() {
		variableConcept obj1= new variableConcept();
		System.out.println(obj1.instancevariable1);
		System.out.println(obj1.instancevariable2);
		System.out.println(staticvariable1);
		System.out.println(staticvariable2);
	}
		public static void main(String[] str) {
			variableConcept vo = new variableConcept();
			vo.m1();
			m2();
		}

}
