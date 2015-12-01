package test_ex;

public class ClassOne {
	// ex)
	int age;
	String name;

	public ClassOne() {
		age = 20;
		name = "홍길동";

	}

	public void methodA() {
		System.out.println(name + "의 나이는" + age + "입니다.");
	}


	
	public static void main(String args[]) {

		ClassOne object = new ClassOne();
		// object.age = 10;
		// object.name = "엄성일";
		object.methodA();

	}
}
