package test_ex;

public class ForEx3 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {

			for (int dan = 1; dan < 10; dan++) {
				System.out.print(i + "*" + dan + "=" + (dan * i) + "\t");
			}
			System.out.println();

		}

	}
}
