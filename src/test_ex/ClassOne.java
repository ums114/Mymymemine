package test_ex;

public class ClassOne {
	// ex)
	int age;
	String name;

	public ClassOne() {
		age = 20;
		name = "ȫ�浿";

	}

	public void methodA() {
		System.out.println(name + "�� ���̴�" + age + "�Դϴ�.");
	}


	
	public static void main(String args[]) {

		ClassOne object = new ClassOne();
		// object.age = 10;
		// object.name = "������";
		object.methodA();

	}
}
