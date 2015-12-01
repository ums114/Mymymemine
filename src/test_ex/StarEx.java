package test_ex;

public class StarEx {
	public static void main(String args[]) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();

		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			System.out.println();

		}

		
		String[] star = new String[5];
		for(int i= 0; i< star.length; i++){
			for(int j = 0; j <= i; j++){
				star[j] = "*";
				System.out.print(star[j]);
			}
			System.out.println();
		}

		
		
	}
}
