package test_ex;

public class ifEx2 {
	public static void main(String args[]) {

		int score = 30;

		if (score > 50 && score < 81) {
			System.out.println("���� ����1");

		} else if (score < 91) {
			System.out.println("���� ����2");
		}

		if (score > 50 && score < 81) {
			System.out.println("���� ����1");
		} else {
			System.out.println("���� ����2");

		}
		if (score > 80 && score < 91) {
			System.out.println("���� ����3");

		} else {
			System.out.println("���� ����4");
		}

		if (!(score <= 0)) {

			if (score > 0 && score < 61) {
				System.out.println("C");
			} else if (score < 81) {
				System.out.println("B");
			} else if (score < 101) {
				System.out.println("A");
			}
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

}
