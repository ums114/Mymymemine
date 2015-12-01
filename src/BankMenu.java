import java.util.Scanner;

class BankMenu {
	String name, ID;
	int password, password2, money;

	void Menu() {

		System.out.println("BankSystem Ver. 0.1");
		System.out.println("======================");
		System.out.println("[1]. 고객 정보 입력");
		System.out.println("[2]. 고객 정보 출력");
		System.out.println("[3]. 전 고객 정보 출력");
		System.out.println("[4]. 금액 입금");
		System.out.println("[5]. 금액 출금");
		System.out.println("[6]. 프로그램 종료 ");
		System.out.println("======================");

	}

	void inforin() {
		Scanner in = new Scanner(System.in);
		int i = 0;
		int j = 0;
		String[] name = new String[5];
		String[] ID = new String[5];

		int password, password2;

		System.out.println("이름을 입력하세요");
		name[i] = in.next();
		System.out.println("ID를 입력하세요");
		ID[0] = in.next();
		System.out.println("password를 입력하세요");
		password = in.nextInt();
		System.out.println("password를 재입력하세요");
		password2 = in.nextInt();

	}

	void inforout() {

		System.out.println(this.name);
		Scanner in = new Scanner(System.in);
		String name;

		System.out.println("고객의 이름을 입력하세욧");
		name = in.next();
		if (this.name == name) {

			System.out.println("고객의 이름은 " + this.name + "ID는 " + this.ID
					+ "입니다.");
		}

	}

	void allinfor() {

	}

	void moneyadd() {
		Scanner in = new Scanner(System.in);
		String name;
		int Money;

		System.out.println("고객의 이름을 입력하세욧");
		name = in.next();
		System.out.println("입금할 금액을 입력하세요 ");
		Money = in.nextInt();

		int result = this.money + Money;

		System.out.println("고객님의 잔액은 " + result + "입니다.");

	}

	void moneyout() {
		Scanner in = new Scanner(System.in);
		String name;
		int Money;

		System.out.println("고객의 이름을 입력하세욧");
		name = in.next();
		System.out.println("인출할 금액을 입력하세요");
		Money = in.nextInt();

		int result = this.money - Money;

		System.out.println("고객님의 잔액은 " + result + "입니다.");

	}

	void exit() {

	}

	void MenuStart() {

		while (true) {

			Scanner in = new Scanner(System.in);
			int a;
			System.out.println("[1]~[6] 까지의 메뉴번호를 입력하세요");
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
