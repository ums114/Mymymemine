import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		// �ؽ� ���̺� Ű /�����͸� �Է��Ѵ�.
		ht.put("���", "Apple");
		ht.put("����", "StrawBerry");
		ht.put("����", "Grapes");
		// �ؽ� ���̺��� ���� Ű�� �̿��Ͽ� ��´�.
		String val = (String) ht.get("����");
		if (val != null) {

			System.out.println("���� -> " + val);
		}

		// Enumeration ���
		System.out.println("<<< Enumeration ����Ͽ� ��ü ��� >>>>");
		Enumeration Enum = ht.keys();
		while (Enum.hasMoreElements()) {
			Object k = Enum.nextElement();
			Object v = ht.get(k);
			System.out.println(k + " : " + v);
		}

	}
}
