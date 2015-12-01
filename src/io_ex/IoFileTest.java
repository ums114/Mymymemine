package io_ex;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IoFileTest {
	// file ���ڿ� ���

	public static void main(String args[]) throws IOException {
		FileReader reader = new FileReader(
				new File("c:/work/javawork/IO/a.txt"));
		// ���� ����Ͽ� ������ ���� �о� ����Ͻÿ�
		// char ch[] = new char[100]; // �迭 ����Ͽ� 100���� ���� Ȯ��
		// reader.read(ch, 0, 100); // 100�� ������ �о��.
		// ������ ���� ���(��ü ���)
		while (reader.ready()) {
			// ready(); �о�� ���ڰ� �ִ� ���� true ��ȯ.
			// char ch = (char) reader.read();
			// System.out.print(ch);
			System.out.print((char) reader.read());
		}
		reader.close(); // ����� ����.

		// System.out.println(new String(ch)); // println() �� ���...

	}
}
