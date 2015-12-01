import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		// 해쉬 테이블에 키 /데이터를 입력한다.
		ht.put("사과", "Apple");
		ht.put("딸기", "StrawBerry");
		ht.put("포도", "Grapes");
		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
		String val = (String) ht.get("포도");
		if (val != null) {

			System.out.println("포도 -> " + val);
		}

		// Enumeration 사용
		System.out.println("<<< Enumeration 사용하여 전체 출력 >>>>");
		Enumeration Enum = ht.keys();
		while (Enum.hasMoreElements()) {
			Object k = Enum.nextElement();
			Object v = ht.get(k);
			System.out.println(k + " : " + v);
		}

	}
}
