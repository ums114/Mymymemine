public class StaticOne {
	public final int a = 10;
	static int b = 10;

	public final void a() {

	}

	public static void main(String args[]) {
		StaticOne so = new StaticOne();
		System.out.println(StaticOne.b);
	}

}

class AAA{

	public final void a() {

	}

}

abstract class AbstractClass {
	abstract void method();
}