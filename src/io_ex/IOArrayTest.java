package io_ex;

public class IOArrayTest {
	public static void main(String args[]) {
		byte b[] = new byte[10]; // ���� ���� �迭 ���� Ȯ��
		System.out.println("�Է� : ");
		char ch = 'a';
		try {
			System.in.read(b, 0, 10);
		} catch (Exception e) {
			System.out.println("Exception :" + e.getMessage());

		}
		System.out.println("��� : ");
		System.out.write(b, 0, 10);
		System.out.println();
	}

}
