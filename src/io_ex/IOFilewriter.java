package io_ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOFilewriter {
	public static void main(String args[]) throws IOException {
		FileWriter fw = new FileWriter(new File(
				"c:/work/javawork/IO/whilefile.txt"));

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("입력");
		String str = "";
		while (!str.equals("end")) {
			str = in.readLine();
			fw.write(str);

		}
		System.out.println("종료 되었습니다. ");
		fw.close();

	}

}
