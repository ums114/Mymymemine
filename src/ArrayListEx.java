import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String args[]) {
		int kor, eng, math, total;
		double avg;
		String �̸�[] = { "���Ѻ�", "�����", "����", "������", "������", "�迵��", "������ ",
				"�ſ���", "������", "�ǿ���" };

		int ����[] = { 30, 20, 100, 50, 60, 80, 99, 81, 49, 56 };
		int ����[] = { 100, 7, 100, 20, 70, 95, 90, 62, 68, 72 };
		int ����[] = { 20, 50, 100, 25, 75, 95, 100, 32, 79, 60 };

		ArrayList v = new ArrayList();
		for (int i = 0; i < �̸�.length; i++) {
			// �پ��� ��ü �߰� ���
			v.add(�̸�[i]);
			v.add(new Integer(����[i]));
			v.add(new Integer(����[i]));
			v.add(new Integer(����[i]));

		}
		System.out.println("------------�л� ���� " + " ��ȸ ���α׷� ------------");
		System.out.println(" �̸�\t����\t����\t����\t����\t���");

		Iterator enu = v.iterator();
		while (enu.hasNext()) {
			System.out.println("\n" + enu.next());
			Integer obj = (Integer) enu.next();
			kor = obj.intValue();
			eng = ((Integer) enu.next()).intValue();
			math = (Integer) enu.next();
			total = kor + eng + math;
			avg = total / 3;
			System.out.println("\t" + kor + "\t" + eng + "\t" + math);
			System.out.println("\t" + total + "\t" + avg);

		}

	}
}
