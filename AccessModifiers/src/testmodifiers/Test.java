package testmodifiers;

public class Test {

	int a = 10;
	
	public static void main(String[] args) {
		 int b = 10;//CTE we cannot use access modifiers to local members
		 demo();
	}
	
	private static void demo()
	{
		System.out.println("this is demo method");
	}
	
	private Test() {
		System.out.println("Cons");
	}
	
	public  static Test createTest() {
		return new Test();
	}
	
//	public  { //cannot use for initializers
//		
//	}
}
