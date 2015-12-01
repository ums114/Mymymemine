package test_ex;

public class ifEX1 {
	public static void main(String args[]) {

		int num = 10;
		if (num > 10) {
			System.out.println("참 입니다.");
		}
		System.out.println("실행 구문");

		// ex2)
		if (num > 10) {
			System.out.println("참 입니다.");
		} else if (false) {
			System.out.println("거짓 입니다.");
		}
	}
}
