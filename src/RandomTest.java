import java.util.Random;

public class RandomTest {

	/*
	 * 1) Random ran = new Random(); ex) int su1 = ran.netxInt(3); 2)Math class*
	 * 기능으로 난수를 사용할 수 있음 ex) int su2 = (int)(Math.random() * 3);
	 */

	public static void main(String args[]) {
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			// float 0.0에서 1.0범위
		}

		float a = ran.nextFloat();
		System.out.print("Float형 난수 : " + a);
		// int n 범위
		int b = ran.nextInt(3);
		System.out.println(" Int형 난수1 : " + b);
		// Math class
		int c = (int) (Math.random() * 3);
		System.out.println("  Int형 난수2 : " + c);
	}
	
	
	
	
	
	
}
