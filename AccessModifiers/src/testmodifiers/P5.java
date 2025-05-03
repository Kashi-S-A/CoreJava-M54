package testmodifiers;

public class P5 {

	public static void main(String[] args) {
//		Test.demo();//CTE
//		Test t = new Test();//CTE
		
		Test t = Test.createTest();
		System.out.println(t);
		
		P6.test();
	}
}
