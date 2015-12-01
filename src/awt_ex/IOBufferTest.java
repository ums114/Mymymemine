package awt_ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOBufferTest {
	public static void main(String args[]) {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String data = "";
		while (true) {
			System.out.println("문자열 입력 :");
			try {
				data = in.readLine();

			} catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
			}

			if (data.equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("입력한 데이터는 : " + data + "입니다.");

		}

	}
}
