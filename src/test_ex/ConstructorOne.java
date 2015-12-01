package test_ex;

public class ConstructorOne {
	int a;

	// 기본 생성자를 정의 해야 할 경우
	ConstructorOne() {

	}

	// 오버로드
	ConstructorOne(int a) {

		System.out.println(a);
	}

	// 오버로드
	ConstructorOne(int a, String s) {
		System.out.println(a + s);
		
	}

	public static void main(String args[]) {
		new ConstructorOne();
		new ConstructorOne(5);
		new ConstructorOne(4, "S");

	}

}
