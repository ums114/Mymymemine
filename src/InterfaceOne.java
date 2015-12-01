/*
 *
  인터페이스(interface)
 - 객체를 생성 할 수 없음.
 - class에서 상속이 implements keyword를 사용.
 - 다중 상속이 가능 함.
 - interface에는 상수와 추상 메서드만이 존재함.
 - interface 간의 상속시에는 extends를 사용함.
 - 일반적인 메서드를 갖을 수 없음.
 - 상속시 interface에 있는 모든 메서드를 재정의하여 사용.
 - interface에 정의된 메서드 중 하나라도 재정의 하지 않는다면.
 abstract class로 정의 할 수 있음. */

/*
 표현)

 interface A{
 변수: [final][static] -> 생략되어 있음.
 ex) int A = 10;

 메서드 : [public][abstract] - > 생략되어 있음.
 ex) void method();

 }

 사용1)
 abstract class B implements A{
 추상 메서드 정의...
 일반적인 메서드 정의...
 }

 사용2)
 Class c implements A{
 인터페이스에 존재하는 메서드 재정의...
 }


 사용3)
 class D extends C implements A{}
 class D extends C implements A,B,C ... {}
 */

interface InterfaceA {
	int b = 100;

	String method();
}

interface InterfaceB {
	int a = 10;

	void setA();

}

abstract class abstractC {
	void setB() {
		System.out.println("B");
	}
}

public class InterfaceOne extends abstractC implements InterfaceA, InterfaceB {

	public String method() {
		return "Overide method";
	}

	public void setA() {
		System.out.println("setA method...");
	}

	public static void main(String args[]) {
		InterfaceOne inter = new InterfaceOne();
		inter.setB();
		System.out.println("number : " + (inter.b + inter.a));
		System.out.println(inter.method());
		inter.setA();
		// inter.a = 50; 상수
		// inter.b = 50; 상수

	}

}
