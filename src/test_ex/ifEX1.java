package test_ex;

public class ifEX1 {
	public static void main(String args[]) {

		int num = 10;
		if (num > 10) {
			System.out.println("�� �Դϴ�.");
		}
		System.out.println("���� ����");

		// ex2)
		if (num > 10) {
			System.out.println("�� �Դϴ�.");
		} else if (false) {
			System.out.println("���� �Դϴ�.");
		}
	}
}
