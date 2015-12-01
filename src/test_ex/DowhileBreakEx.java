package test_ex;

public class DowhileBreakEx {
	public static void main(String args[]) {
		int i = 0;
		boolean result = true;
		do {
			i++;
			if (result) {
				System.out.println("실행 구문:" + i);
				if (i == 5) {
					result = false;

				}
				if (! result) {
					System.out.println("실행 구문 종료합니다.");
					break;

				}
			} else {
				System.out.println("i :" + i);
			}
		} while (i < 10);
	}
}
