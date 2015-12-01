package io_ex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTestfile2 {
	public static void main(String args[]) throws IOException {
		FileOutputStream fw = new FileOutputStream(new File(
				"c:/work/javawork/IO/e.txt"));

		System.out.println("ют╥б : ");
		int abc = 0;
		while (abc != -1) {
			abc = System.in.read();
			fw.write(abc);
		}
		fw.close();
	}
}
