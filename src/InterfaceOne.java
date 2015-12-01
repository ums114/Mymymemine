/*
 *
  �������̽�(interface)
 - ��ü�� ���� �� �� ����.
 - class���� ����� implements keyword�� ���.
 - ���� ����� ���� ��.
 - interface���� ����� �߻� �޼��常�� ������.
 - interface ���� ��ӽÿ��� extends�� �����.
 - �Ϲ����� �޼��带 ���� �� ����.
 - ��ӽ� interface�� �ִ� ��� �޼��带 �������Ͽ� ���.
 - interface�� ���ǵ� �޼��� �� �ϳ��� ������ ���� �ʴ´ٸ�.
 abstract class�� ���� �� �� ����. */

/*
 ǥ��)

 interface A{
 ����: [final][static] -> �����Ǿ� ����.
 ex) int A = 10;

 �޼��� : [public][abstract] - > �����Ǿ� ����.
 ex) void method();

 }

 ���1)
 abstract class B implements A{
 �߻� �޼��� ����...
 �Ϲ����� �޼��� ����...
 }

 ���2)
 Class c implements A{
 �������̽��� �����ϴ� �޼��� ������...
 }


 ���3)
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
		// inter.a = 50; ���
		// inter.b = 50; ���

	}

}
