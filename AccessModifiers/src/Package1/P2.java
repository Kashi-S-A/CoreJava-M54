package Package1;

public class P2 extends P1{

	public static void main(String[] args) {
		System.out.println(a);
//		System.out.println(P1.b);//private variable
		System.out.println(P1.c);
//		System.out.println(b);
		System.out.println(c);//protected members can be inherited
		System.out.println(d);
		System.out.println(P1.d);
	}
}
