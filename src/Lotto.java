import java.util.Random;

public class Lotto {
	public static void main(String args[]) {

		Random ran = new Random();

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(6) + 1;

			for (int j = 0; j < i; j++) {

				// lotto[j] = ran.nextInt(45) + 1;

				if (lotto[i] == lotto[j]) {

					lotto[i] = ran.nextInt(6) + 1;
					j = -1;
				}
			}

			System.out.println(lotto[i]);

		}

	}
}
