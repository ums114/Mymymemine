import java.util.*;

public class StringTokenizerEx {
	public static void main(String args[]) {
		String str = "�ڹ� SE, �ڹ� EE, �ڹ� ME";
		String delim = ",";
		StringTokenizer st;
		st = new StringTokenizer(str, delim, true);
		// st = new StringTokenizer(str, delim, true);
		System.out.println(st.countTokens());
		int count = 0;
		while (st.hasMoreTokens()) {

			System.out.println("�ڹٰ���" + ++count + " : " + st.nextToken());

		}

	}

}
