interface Interface {

}

class Parent implements Interface {
	int a = 10;
}

class Child extends Parent {

}

public class InstanceofEx {
	public static void main(String args[]) {
		Child child = new Child();
		if (child instanceof Interface) {
			System.out.println("child is instance of Interface.");

		}
		if (child instanceof Object) {
			System.out.println("child is instance of object.");

		}
		if (child instanceof Parent) {
			System.out.println("child is instance of Parent");
		}
		if (child instanceof Child) {
			System.out.println("child is instance of Child");

		}
		System.out.println();

		// 잘못 사용한 예
		if (child instanceof Object) {
			System.out.println("child is instance of object.");
		} else if (child instanceof Interface) {
			System.out.println("child is instance of Interface.");
		} else if (child instanceof Parent) {
			System.out.println("child is instance of Parent.");
		} else if (child instanceof Child) {
			System.out.println("child is instance of Child");
		}

	}
}
