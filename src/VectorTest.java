import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
	/*
	 * Collection 객체를 담을 수 있는 기억장소, 여러가지 자료를 적절한 형태로 처리하고 저장하는 저자형태(묶음)의 자료구조.
	 */

	public static void main(String args[]) {
		Vector<String> vc = new Vector<String>();

		vc.add("홍길동");
		vc.add("칠득이");
		vc.add("만득이");

		String s = vc.get(0);
		String s2 = vc.get(1);
		String s3 = vc.get(2);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("이름을 입력하세요 : ");
		String name = new Scanner(System.in).next();
		// 문자열을 입력하세요.
		int index = vc.indexOf(name); // 인덱스 번호를 가져오는 기능

		if (vc.contains(name)) {
			System.out.println("검색결과 있음 : " + vc.get(index));
			if (vc.remove(name)) {
				System.out.println("삭제 완료!!");
			}
			System.out.println("<<출력 결과 표현 1");
			for (int i = 0; i < vc.size(); i++) {
				Object obj = vc.get(i);
				String str = (String) obj;
				System.out.println(str);

			}
			System.out.println("<<출력 결과 - 표현 2 >>");
			Iterator it = vc.iterator();
			while (it.hasNext()) {
				String n = (String) it.next();
			}

			System.out.println("<<출력 결과 - 표현 3>> ");
			Enumeration e = vc.elements();
			while (e.hasMoreElements()) {
				Object obj = e.nextElement();
				String str = (String) obj;
				System.out.println(str);
			}

			System.out.println("<< 출력 결과 - 표현 4>> ");
			for (Object obj : vc) {
				String str = (String) obj;
				System.out.println(str);
			}
		} else {
			System.out.println("검색결과 없음 !");

		}
	}
}
