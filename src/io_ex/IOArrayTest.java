package io_ex;

public class IOArrayTest {
	public static void main(String args[]) {
		byte b[] = new byte[10]; // 문자 담을 배열 공간 확보
		System.out.println("입력 : ");
		char ch = 'a';
		try {
			System.in.read(b, 0, 10);
		} catch (Exception e) {
			System.out.println("Exception :" + e.getMessage());

		}
		System.out.println("출력 : ");
		System.out.write(b, 0, 10);
		System.out.println();
	}

}
