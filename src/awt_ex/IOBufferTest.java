package awt_ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOBufferTest {
	public static void main(String args[]) {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String data = "";
		while (true) {
			System.out.println("���ڿ� �Է� :");
			try {
				data = in.readLine();

			} catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
			}

			if (data.equals("end")) {
				System.out.println("���α׷� ����");
				break;
			}
			System.out.println("�Է��� �����ʹ� : " + data + "�Դϴ�.");

		}

	}
}
