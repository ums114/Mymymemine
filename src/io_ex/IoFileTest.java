package io_ex;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IoFileTest {
	// file 문자열 출력

	public static void main(String args[]) throws IOException {
		FileReader reader = new FileReader(
				new File("c:/work/javawork/IO/a.txt"));
		// 열을 사용하여 파일의 문자 읽어 출력하시오
		// char ch[] = new char[100]; // 배열 사용하여 100문자 공간 확보
		// reader.read(ch, 0, 100); // 100자 까지만 읽어옴.
		// 파일의 문자 출력(전체 출력)
		while (reader.ready()) {
			// ready(); 읽어올 문자가 있는 동안 true 반환.
			// char ch = (char) reader.read();
			// System.out.print(ch);
			System.out.print((char) reader.read());
		}
		reader.close(); // 사용후 닫음.

		// System.out.println(new String(ch)); // println() 로 출력...

	}
}
