public class ExceptionTest {
	public static void main(String args[]) {

		try {
			// RunTimeException
			// try{}catch(){}���� ����...����뿡��ó����...
			int[] Array = new int[3];
			Array[0] = 0;
			Array[1] = 10;
			Array[2] = 20;
			// ���Ƿ� �������� : Array�� ������ ������� �Ѵ�.
			for (int i = 0; i < Array.length + 1; i++)
				System.out.println("Array[" + i + "]=" + Array[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		} finally {
			System.out.println("finally ���� !!!");

		}
		// ���� �߻� ������ ���� ���� ó���� �ؾ��� ��츦 ��� ���ô�.
	}
}
