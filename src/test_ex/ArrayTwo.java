package test_ex;

public class ArrayTwo {
	public static void main(String args[]) {

		int[] dan2 = new int[] { 2, 3, 7 };

		for (int i = 0; i < dan2.length; i++) {

			for (int a = 1; a < 10; a++) {
				System.out.print( dan2[i] + "*" + a + "="
						+ (dan2[i] * a) + "\t");

			}
			System.out.println();
			
			
		}

	}

}
