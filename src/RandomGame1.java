import java.util.Random;
import java.util.Scanner;

public class RandomGame1 {

	public static void main(String args[]) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int na, com;

		System.out.println("������ ���ڽ��ϱ�? 1 : ����, 2: ���� , 3: �� ");

		na = sc.nextInt();
		com = r.nextInt(3);

		if (com == 1) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		} else if (com == 2) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		} else {
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
		}
		int result = (na - com + 3) % 3;

		switch (result) {
		case 0:
			System.out.print("�����ϴ�. ");
			break;
		case 1:
			System.out.print("����� �̰���ϴ�.");
			break;
		case 2:
			System.out.println("����� �����ϴ� �Ф�");
			break;

		}

	}
}
