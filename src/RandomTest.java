import java.util.Random;

public class RandomTest {

	/*
	 * 1) Random ran = new Random(); ex) int su1 = ran.netxInt(3); 2)Math class*
	 * ������� ������ ����� �� ���� ex) int su2 = (int)(Math.random() * 3);
	 */

	public static void main(String args[]) {
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			// float 0.0���� 1.0����
		}

		float a = ran.nextFloat();
		System.out.print("Float�� ���� : " + a);
		// int n ����
		int b = ran.nextInt(3);
		System.out.println(" Int�� ����1 : " + b);
		// Math class
		int c = (int) (Math.random() * 3);
		System.out.println("  Int�� ����2 : " + c);
	}
	
	
	
	
	
	
}
