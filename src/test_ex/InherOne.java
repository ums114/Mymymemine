package test_ex;

/*
 * ���(inhertitance) ����̶� �ڽ��� �θ� ������ �ִ� ����̳� �Ƿ��� �����޴´ٴ� �ǹ�. - Ư��(�ڽ�) Ŭ������
 * �ٸ�(�θ�) Ŭ������ ������ �ִ� ��� ��������� ����޼ҵ带 ����� �� ����. -��� ���迡�� �ڽ�Ŭ������ ��ü�� ���� �Ͽ�����
 * �θ� Ŭ������ ��ü�� �����Ǿ� ��. -��� ���� ǥ������ extends keyword�� �����. -��� ���� ���� super,
 * ����, �θ� class�� sub, ����, �ڽ� class�� ��� ��. -����� ���信�� super�� this�� ������. -�޼��带
 * ���� �� �� ����(method override). -���� ���(�ڹٿ����� ���� ���X). -extends �� implements��
 * ��� �� �� ����.
 * 
 * ����) class A extends B{ ���� ����; }
 */

public class InherOne extends SuperOne {
	int a;
	String b;
	

	public InherOne() {
		// super(); <<<<---- ���� ������.

	}

	public static void main(String args[]) {
		new InherOne();
	}

}

class SuperOne {
	public SuperOne(){}    // <<-- �����ε� �����ÿ��� ����Ʈ �����ڸ� �׻� �����ؾ� �ȴ�. 
	
	public SuperOne(int a) {
		System.out.println("superConstructor");

	}

	int c;
	String d;

}

