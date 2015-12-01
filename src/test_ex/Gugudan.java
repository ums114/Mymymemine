package test_ex;

public class Gugudan {

	public String A(int su1, int su2) {
		int dan = su1 + su2;
		for (int i = 2; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i) + "\t");

		}

		return "두 수의 곱은 : " + su1 * su2 + "입니다.";
	}

	public static void main(String args[]) {
		Gugudan a = new Gugudan();

		String result = a.A(2, 6);
		System.out.println(result);
	}

}
