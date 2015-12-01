package test_ex;

/*
 * 상속(inhertitance) 상속이란 자식이 부모가 가지고 있는 재산이나 권력을 물려받는다는 의미. - 특정(자식) 클래스는
 * 다른(부모) 클래스가 가지고 있는 모든 멤버변수나 멤버메소드를 사용할 수 있음. -상속 관계에서 자식클래스의 객체를 생성 하였을때
 * 부모 클래스의 객체도 생서되어 짐. -상속 관계 표현으로 extends keyword를 사용함. -상속 관계 용어로 super,
 * 상위, 부모 class와 sub, 하위, 자식 class로 사용 함. -상속의 개념에서 super와 this를 구분함. -메서드를
 * 재사용 할 수 있음(method override). -단일 상속(자바에서는 다중 상속X). -extends 와 implements를
 * 사용 할 수 있음.
 * 
 * 형식) class A extends B{ 문장 구현; }
 */

public class InherOne extends SuperOne {
	int a;
	String b;
	

	public InherOne() {
		// super(); <<<<---- 생략 되있음.

	}

	public static void main(String args[]) {
		new InherOne();
	}

}

class SuperOne {
	public SuperOne(){}    // <<-- 오버로드 생성시에는 디폴트 생성자를 항상 생성해야 된다. 
	
	public SuperOne(int a) {
		System.out.println("superConstructor");

	}

	int c;
	String d;

}

