package test_ex;

public class ConstructorOne {
	int a;

	// �⺻ �����ڸ� ���� �ؾ� �� ���
	ConstructorOne() {

	}

	// �����ε�
	ConstructorOne(int a) {

		System.out.println(a);
	}

	// �����ε�
	ConstructorOne(int a, String s) {
		System.out.println(a + s);
		
	}

	public static void main(String args[]) {
		new ConstructorOne();
		new ConstructorOne(5);
		new ConstructorOne(4, "S");

	}

}
