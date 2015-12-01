import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
	/*
	 * Collection ��ü�� ���� �� �ִ� ������, �������� �ڷḦ ������ ���·� ó���ϰ� �����ϴ� ��������(����)�� �ڷᱸ��.
	 */

	public static void main(String args[]) {
		Vector<String> vc = new Vector<String>();

		vc.add("ȫ�浿");
		vc.add("ĥ����");
		vc.add("������");

		String s = vc.get(0);
		String s2 = vc.get(1);
		String s3 = vc.get(2);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = new Scanner(System.in).next();
		// ���ڿ��� �Է��ϼ���.
		int index = vc.indexOf(name); // �ε��� ��ȣ�� �������� ���

		if (vc.contains(name)) {
			System.out.println("�˻���� ���� : " + vc.get(index));
			if (vc.remove(name)) {
				System.out.println("���� �Ϸ�!!");
			}
			System.out.println("<<��� ��� ǥ�� 1");
			for (int i = 0; i < vc.size(); i++) {
				Object obj = vc.get(i);
				String str = (String) obj;
				System.out.println(str);

			}
			System.out.println("<<��� ��� - ǥ�� 2 >>");
			Iterator it = vc.iterator();
			while (it.hasNext()) {
				String n = (String) it.next();
			}

			System.out.println("<<��� ��� - ǥ�� 3>> ");
			Enumeration e = vc.elements();
			while (e.hasMoreElements()) {
				Object obj = e.nextElement();
				String str = (String) obj;
				System.out.println(str);
			}

			System.out.println("<< ��� ��� - ǥ�� 4>> ");
			for (Object obj : vc) {
				String str = (String) obj;
				System.out.println(str);
			}
		} else {
			System.out.println("�˻���� ���� !");

		}
	}
}
