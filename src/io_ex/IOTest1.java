package io_ex;

import java.io.IOException;

public class IOTest1 {

	public static void main(String args[]) {
		int b = 0, count = 0;
		try {
			b = System.in.read();
			while (b != -1) {
				System.out.print((char) b);
				count++;
				b = System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n byte InputStream Test..." + "total byte :"
				+ count);
	}
}
