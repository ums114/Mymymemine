import java.util.Calendar;

public class CalendarTest {

	/*
	 * Calendar class�� 1970�� 1�� 1�Ϻ��� Ư�� ������ ������ ���鼭 ��¥�� �ð��� ���� ������ ������ �� �ֵ���
	 * abstract class�̴�. Object ���� ���� ������ ����. 1) Calendar cal =
	 */

	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = (cal.get(Calendar.MONTH) + 1);
		// 1���� 0�� ����Ѵ�.
		int date = cal.get(Calendar.DATE);

		System.out.println("�� : " + year);
		System.out.println("�� : " + month);
		;
		System.out.println("�� : " + date);
		;

		// ��,��,�� �� ����� ������.

		int day1 = cal.get(Calendar.DAY_OF_YEAR);
		int day2 = cal.get(Calendar.DAY_OF_MONTH);
		int day3 = cal.get(Calendar.DAY_OF_WEEK);
		int week = cal.get(Calendar.WEEK_OF_YEAR);

		System.out.println("������ ������ : " + day1 + "���Դϴ�.");
		System.out.println("������ �̹��� : " + day2 + "�����Դϴ�.");
		System.out.println("������ �̹��� : " + day3 + "���Դϴ�..");
		System.out.println("������ ������ : " + week + "���Դϴ�.\n");

		String[] yoil = { "��", "��", "ȭ", "��", "��", "��", "��" };

		// �������
		System.out.println("������ ������" + yoil[day3 - 1] + "���� �Դϴ�.");

		// �޷� �����

	}
}
