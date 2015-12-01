import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
	public Scanner scan;
	/*
	 * private String[] cust_id; private String[] cust_pw; private int[]
	 * cust_gold; private String[] cust_vip;
	 */
	private ArrayList<Customer> custs;

	public int cust_idx;

	public BankSystem(int size) {
		scan = new Scanner(System.in);
		custs = new ArrayList<Customer>();

		/*
		 * cust_id = new String[size]; cust_pw = new String[size]; cust_gold =
		 * new int[size]; cust_vip = new String[size];
		 */
		int input = 0;
		do {
			menu();
			System.out.print("메뉴를 선택해 주세요 : ");
			input = inputInt();
			switch (input) {
			case 1:
				inputInfo();
				break;
			case 2:
				outputInfo();
				break;
			case 3:
				outputAllInfo();
				break;
			case 4:
				moneyadd();
				break;
			case 5:
				moneyminus();
				break;
			}
		} while (input != 6);
		System.out.println("이용해주셔서 감사합니다.");
	}

	public void menu() {
		System.out.println("\n BankSystem Ver. 0.1");
		System.out.println("=========================");
		System.out.println("[1]. 고객 정보 입력");
		System.out.println("[2]. 고객 정보 출력");
		System.out.println("[3]. 전 고객 정보 출력");
		System.out.println("[4]. 금액 입금");
		System.out.println("[5]. 금액 출금");
		System.out.println("[6]. 프로그램 종료");
		System.out.println("=========================");

	}

	public void inputInfo() {
		// custs[cust_idx] = new Customer();
		Customer cust = new Customer();
		custs.add(cust);

		String temp = null;
		System.out.print("사용자 아이디를 입력해 주세요 : ");
		// cust_id[cust_idx] = inputStr();
		String id = inputStr();
		custs.get(cust_idx).setid(id);
		do {
			System.out.print("사용자 암호를 입력해 주세요 : ");
			// cust_pw[cust_idx] = inputStr();
			String pw = inputStr();
			custs.get(cust_idx).setPw(pw);
			System.out.print("암호를 재입력해 주세요 : ");
			temp = inputStr();

		} while (!custs.get(cust_idx).getPw().equals(temp));

		System.out.println("잔고를 입력해주세요");
		// cust_gold[cust_idx] = inputInt();
		custs.get(cust_idx).setGold(inputInt());

		System.out.println("우수고객 여부를 설정해주세요 Y/N");
		// cust_vip[cust_idx] = inputStr();
		custs.get(cust_idx).setVip(inputStr());

		++cust_idx;
	}

	public void outputInfo() {

		System.out.println("아이디를 입력해 주세요 : ");
		String id = inputStr();

		System.out.println("사용자 정보 확인");
		for (int i = 0; i < cust_idx; i++) {
			if (custs.get(i).getid().equals(id)) {

				System.out.println(custs.get(i).getid() + " 님 정보 : " + "\t암호 :"
						+ custs.get(i).getPw() + "\t잔고 : "
						+ custs.get(i).getGold() + "    vip : ");

				if (checkedvip(i))
					System.out.println("우수고객");
				else
					System.out.print("일반고객");
				System.out.println("입니다.");
				break;

			}
		}
	}

	public void outputAllInfo() {
		System.out.println("3.전체 정보 출력을 선택하셨습니다.");

		for (int i = 0; i < cust_idx; i++) {
			System.out.println(custs.get(i).getid() + " 님 정보 : " + "\t암호 :"
					+ custs.get(i).getPw() + "\t잔고 :" + custs.get(i).getGold()
					+ "입니다.");

		}
	}

	public void moneyadd() {
		System.out.println("4.입금을 선택하셨습니다.");
		System.out.println("아이디 입력: ");
		String id = inputStr();
		System.out.println("패스워드 입력: ");
		String pw = inputStr();
		boolean pw_check;

		for (int i = 0; i < cust_idx; i++) {
			if (custs.get(i).getid().equals(id)) {
				do {
					pw_check = custs.get(i).getPw().equals(pw);
					if (pw_check) {
						System.out.println("입금 액 : ");
						int cust_gold = custs.get(i).getGold();
						cust_gold += inputInt();
						custs.get(i).setGold(cust_gold);
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				} while (!pw_check);
			} else {
				System.out.println("사용자가 없습니다.");

			}
		}

	}

	public void moneyminus() {
		System.out.println("5. 출금을 선택 하셨습니다.");
		System.out.println("아이디 입력: ");
		String id = inputStr();
		System.out.println("패스워드 입력: ");
		String pw = inputStr();
		boolean pw_check;

		for (int i = 0; i < cust_idx; i++) {
			if (custs.get(i).getid().equals(id)) {
				do {
					pw_check = custs.get(i).getPw().equals(pw);
					if (pw_check) {
						System.out.println("출금 액 : ");

						boolean vip = checkedvip(i);
						int gold;
						if (vip) {
							gold = inputInt();
						} else {
							gold = (inputInt() + 500);
						}
						if (gold <= custs.get(i).getGold()) {
							int cust_gold = custs.get(i).getGold();
							cust_gold -= gold;
							custs.get(i).setGold(cust_gold);

						} else {
							System.out.print("출금액 초과!!");
							pw_check = false;
						}

					} else {
						System.out.println("비밀번호가 틀렸습니다.  ");
						System.out.println("\n 암호 재입력:");
						pw = inputStr();

					}
				} while (!pw_check);
			} else {
				System.out.println("사용자가 없습니다.");

			}
		}

	}

	public boolean checkedvip(int idx) {
		boolean result = false;
		switch (custs.get(idx).getVip()) {
		case "yes":
		case "y":
		case "Y":
			result = true;

			break;
		case "no":
		case "n":
		case "N":
			result = false;
			break;
		default:
			System.out.println("Wrong answe");
			break;
		}
		return result;
	}

	public int inputInt() {
		return scan.nextInt();
	}

	public String inputStr() {
		return scan.next();
	}

	public static void main(String args[]) {

		new BankSystem(Integer.parseInt(args[0]));

	}
}

class Customer {
	private String id;
	private String pw;
	private int gold;
	private String vip;

	// ex) setXX, getXX
	public void setid(String id) {
		this.id = id;
	}

	public String getid() {
		return this.id; // this생략 가능
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

}
