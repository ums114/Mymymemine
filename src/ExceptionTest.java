public class ExceptionTest {
	public static void main(String args[]) {

		try {
			// RunTimeException
			// try{}catch(){}생략 가능...디버깅에서처리함...
			int[] Array = new int[3];
			Array[0] = 0;
			Array[1] = 10;
			Array[2] = 20;
			// 고의로 에러유발 : Array의 범위를 벗어나도록 한다.
			for (int i = 0; i < Array.length + 1; i++)
				System.out.println("Array[" + i + "]=" + Array[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		} finally {
			System.out.println("finally 실행 !!!");

		}
		// 예외 발생 지역에 대한 예외 처리를 해야할 경우를 배워 봅시다.
	}
}
