import java.util.*;

public class StringTokenizerEx {
	public static void main(String args[]) {
		String str = "자바 SE, 자바 EE, 자바 ME";
		String delim = ",";
		StringTokenizer st;
		st = new StringTokenizer(str, delim, true);
		// st = new StringTokenizer(str, delim, true);
		System.out.println(st.countTokens());
		int count = 0;
		while (st.hasMoreTokens()) {

			System.out.println("자바과정" + ++count + " : " + st.nextToken());

		}

	}

}
