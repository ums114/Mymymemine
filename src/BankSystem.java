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
			System.out.print("�޴��� ������ �ּ��� : ");
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
		System.out.println("�̿����ּż� �����մϴ�.");
	}

	public void menu() {
		System.out.println("\n BankSystem Ver. 0.1");
		System.out.println("=========================");
		System.out.println("[1]. �� ���� �Է�");
		System.out.println("[2]. �� ���� ���");
		System.out.println("[3]. �� �� ���� ���");
		System.out.println("[4]. �ݾ� �Ա�");
		System.out.println("[5]. �ݾ� ���");
		System.out.println("[6]. ���α׷� ����");
		System.out.println("=========================");

	}

	public void inputInfo() {
		// custs[cust_idx] = new Customer();
		Customer cust = new Customer();
		custs.add(cust);

		String temp = null;
		System.out.print("����� ���̵� �Է��� �ּ��� : ");
		// cust_id[cust_idx] = inputStr();
		String id = inputStr();
		custs.get(cust_idx).setid(id);
		do {
			System.out.print("����� ��ȣ�� �Է��� �ּ��� : ");
			// cust_pw[cust_idx] = inputStr();
			String pw = inputStr();
			custs.get(cust_idx).setPw(pw);
			System.out.print("��ȣ�� ���Է��� �ּ��� : ");
			temp = inputStr();

		} while (!custs.get(cust_idx).getPw().equals(temp));

		System.out.println("�ܰ� �Է����ּ���");
		// cust_gold[cust_idx] = inputInt();
		custs.get(cust_idx).setGold(inputInt());

		System.out.println("����� ���θ� �������ּ��� Y/N");
		// cust_vip[cust_idx] = inputStr();
		custs.get(cust_idx).setVip(inputStr());

		++cust_idx;
	}

	public void outputInfo() {

		System.out.println("���̵� �Է��� �ּ��� : ");
		String id = inputStr();

		System.out.println("����� ���� Ȯ��");
		for (int i = 0; i < cust_idx; i++) {
			if (custs.get(i).getid().equals(id)) {

				System.out.println(custs.get(i).getid() + " �� ���� : " + "\t��ȣ :"
						+ custs.get(i).getPw() + "\t�ܰ� : "
						+ custs.get(i).getGold() + "    vip : ");

				if (checkedvip(i))
					System.out.println("�����");
				else
					System.out.print("�Ϲݰ�");
				System.out.println("�Դϴ�.");
				break;

			}
		}
	}

	public void outputAllInfo() {
		System.out.println("3.��ü ���� ����� �����ϼ̽��ϴ�.");

		for (int i = 0; i < cust_idx; i++) {
			System.out.println(custs.get(i).getid() + " �� ���� : " + "\t��ȣ :"
					+ custs.get(i).getPw() + "\t�ܰ� :" + custs.get(i).getGold()
					+ "�Դϴ�.");

		}
	}

	public void moneyadd() {
		System.out.println("4.�Ա��� �����ϼ̽��ϴ�.");
		System.out.println("���̵� �Է�: ");
		String id = inputStr();
		System.out.println("�н����� �Է�: ");
		String pw = inputStr();
		boolean pw_check;

		for (int i = 0; i < cust_idx; i++) {
			if (custs.get(i).getid().equals(id)) {
				do {
					pw_check = custs.get(i).getPw().equals(pw);
					if (pw_check) {
						System.out.println("�Ա� �� : ");
						int cust_gold = custs.get(i).getGold();
						cust_gold += inputInt();
						custs.get(i).setGold(cust_gold);
					} else {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					}
				} while (!pw_check);
			} else {
				System.out.println("����ڰ� �����ϴ�.");

			}
		}

	}

	public void moneyminus() {
		System.out.println("5. ����� ���� �ϼ̽��ϴ�.");
		System.out.println("���̵� �Է�: ");
		String id = inputStr();
		System.out.println("�н����� �Է�: ");
		String pw = inputStr();
		boolean pw_check;

		for (int i = 0; i < cust_idx; i++) {
			if (custs.get(i).getid().equals(id)) {
				do {
					pw_check = custs.get(i).getPw().equals(pw);
					if (pw_check) {
						System.out.println("��� �� : ");

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
							System.out.print("��ݾ� �ʰ�!!");
							pw_check = false;
						}

					} else {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.  ");
						System.out.println("\n ��ȣ ���Է�:");
						pw = inputStr();

					}
				} while (!pw_check);
			} else {
				System.out.println("����ڰ� �����ϴ�.");

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
		return this.id; // this���� ����
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
