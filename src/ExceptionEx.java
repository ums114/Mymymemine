public class ExceptionEx {
	String str = "";

	public void foo(int i) {
		try {
			if (i == 1) {
				throw new Exception();
			}
			str += "1 ";
		} catch (Exception e) {
			str += "2";
			return;
		} finally {
			str += "3";

		}
		str += "4";
	}// foo

	public static void main(String args[]) {
		ExceptionEx ee = new ExceptionEx();
		ee.foo(0);
		System.out.println(ee.str);
	}

}