import java.util.Scanner;

class BankMenu {
	String name, ID;
	int password, password2, money;

	void Menu() {

		System.out.println("BankSystem Ver. 0.1");
		System.out.println("======================");
		System.out.println("[1]. �� ���� �Է�");
		System.out.println("[2]. �� ���� ���");
		System.out.println("[3]. �� �� ���� ���");
		System.out.println("[4]. �ݾ� �Ա�");
		System.out.println("[5]. �ݾ� ���");
		System.out.println("[6]. ���α׷� ���� ");
		System.out.println("======================");

	}

	void inforin() {
		Scanner in = new Scanner(System.in);
		int i = 0;
		int j = 0;
		String[] name = new String[5];
		String[] ID = new String[5];

		int password, password2;

		System.out.println("�̸��� �Է��ϼ���");
		name[i] = in.next();
		System.out.println("ID�� �Է��ϼ���");
		ID[0] = in.next();
		System.out.println("password�� �Է��ϼ���");
		password = in.nextInt();
		System.out.println("password�� ���Է��ϼ���");
		password2 = in.nextInt();

	}

	void inforout() {

		System.out.println(this.name);
		Scanner in = new Scanner(System.in);
		String name;

		System.out.println("���� �̸��� �Է��ϼ���");
		name = in.next();
		if (this.name == name) {

			System.out.println("���� �̸��� " + this.name + "ID�� " + this.ID
					+ "�Դϴ�.");
		}

	}

	void allinfor() {

	}

	void moneyadd() {
		Scanner in = new Scanner(System.in);
		String name;
		int Money;

		System.out.println("���� �̸��� �Է��ϼ���");
		name = in.next();
		System.out.println("�Ա��� �ݾ��� �Է��ϼ��� ");
		Money = in.nextInt();

		int result = this.money + Money;

		System.out.println("������ �ܾ��� " + result + "�Դϴ�.");

	}

	void moneyout() {
		Scanner in = new Scanner(System.in);
		String name;
		int Money;

		System.out.println("���� �̸��� �Է��ϼ���");
		name = in.next();
		System.out.println("������ �ݾ��� �Է��ϼ���");
		Money = in.nextInt();

		int result = this.money - Money;

		System.out.println("������ �ܾ��� " + result + "�Դϴ�.");

	}

	void exit() {

	}

	void MenuStart() {

		while (true) {

			Scanner in = new Scanner(System.in);
			int a;
			System.out.println("[1]~[6] ������ �޴���ȣ�� �Է��ϼ���");
			a = in.nextInt();

			switch (a) {

			case 1:
				inforin();
				break;

			case 2:
				inforout();
				break;

			case 3:
				allinfor();
				break;

			case 4:
				moneyadd();
				break;

			case 5:
				moneyout();
				break;

			}

		}
	}

	public static void main(String args[]) {
		BankMenu menu = new BankMenu();
		menu.Menu();
		menu.MenuStart();
	}
}
