public class StringEX {
	public static void main(String args[]) {
		Object o = "obj";
		String s = "obj";
		String s2 = "obj";
		String z = "obj";
		String d = " ";

		if (o instanceof Object) {
			System.out.println("ok!\n");
		}
		System.out.println(o);
		System.out.println(z = o.toString());
		System.out.println(s.equals(d));
		System.out.println(o == s);
		o = s;
		String s3 = new String("obj");
		System.out.println("결과1:" + (s == s3));
		System.out.println("결과2:" + s.equals(s3));
		System.out.println("\n//////////////////////// \n");
		String str1 = "ABCDEFG";
		String str2 = "가나다라마바사";

		char c = str1.charAt(3);
		System.out.println(c);

		String con = str1.concat(str2);
		System.out.println(con);

		boolean state = str1.equals(str2);
		System.out.println(state);

		int leng = str1.length();
		System.out.println(leng);

		String rep = str1.replace('F', 'Z');
		System.out.println(rep);

		String repall = str1.replaceAll("ABC", "XYZ");
		System.out.println(repall);

		String sub1 = str1.substring(2);
		System.out.println(sub1);

		String sub2 = str1.substring(2, 5);
		System.out.println(sub2);

		String empty = "      ab c ";
		System.out.println(empty);

		String tr = empty.trim();
		System.out.println(tr);

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == (char) 65 || str1.charAt(i) == (char) 69)
				System.out.println(">>>" + str1.charAt(i));

		}

	}

}
