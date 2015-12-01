public class IntergerTest {

	public  class IntegerTest {
		public static void main(String args[]) {
			int a = Integer.parseInt(args[0]);
			Integer b = new Integer(10);
			int c = b.intValue();
			int sum = a + c;
			System.out.println("결과 1 : " + sum);

			// *e오토박싱 오토 언 박싱
			int d = new Integer(100);
			Integer e = 200;
			int sum2 = d + e;
			Integer sum3 = d + e;

			System.out.println("결과 2 : " + sum2);
			System.out.println("결과 2 : " + sum3);

		}

	}

}
