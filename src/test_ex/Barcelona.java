package test_ex;

interface Team {
	/**
	 * �������� ����ϴ� ��� *String value @return
	 */
	String readerName();

	String nationalName();
}

abstract class Barcelona implements Team {
	int age;
	String name;

	abstract void result();

	public String readerName() {
		return "Enrique";
	}

	public String nationalName() {
		return "Barcelona";
	}

}

class Neymar extends Barcelona {
	static int time;
	static int age;
	static int pass;
	static int longpassnum;
	static int shortpassnum;
	static int stamina;
	String name;
	String shortpass;
	String longpass;
	final static String team = "Barcelona";

	public Neymar() {
		age = 23;
		stamina = 25;
		name = "���̸���";
	}

	public void appear() throws Exception {

		System.out.println(team + "�� " + age + "����" + name + "���� ���� �մϴ�."
				+ "\n\n");
		Thread.sleep(2000);
	}

	public void Time(int time) throws Exception {
		this.time = time;
		while (true) {
			if (time < 90) {

				System.out.println("��� �ð��� " + (90 - time) + "�� ���ҽ��ϴ�.");
				System.out.println(name + "������ ü����" + stamina + " ���ҽ��ϴ�. ");
				System.out.println();
				time += 10;
				stamina -= 5;
				Thread.sleep(2000);

			} else {
				System.out.print("��Ⱑ �������ϴ�.");
				Thread.sleep(2000);
				break;
			}

		}
		System.out.println("\n" + name + "������ �λ󿡼� �Ϻ��� ȸ������ ������ ���Դϴ�.");
	}

	public void pass(int passmax, int passmin) {
		this.pass = (int) (Math.random() * (passmax - passmin + 1)) + passmin;

	}

	public void pass(String shortp, String longp) {

		int shor = (int) (Math.random() * this.pass);
		shortpass = shortp;
		longpass = longp;
		longpassnum = shor;
		shortpassnum = this.pass - shor;

	}

	public void result() {
		System.out.println(name + "������" + "\n" + "\n" + (90 - time)
				+ "�� �� �����ð��� ��" + pass + "���� �н��� �������׽��ϴ�.\n" + shortpassnum
				+ "���� " + shortpass + "�� " + longpassnum + "���� " + longpass
				+ "�� ���� ���׽��ϴ�.");
		System.out.println(name + "������ �� ������ "
				+ ((pass + (90 - this.time) + (100 - stamina)) * 0.04)
				+ " �� �Դϴ�.");
		System.out.println("�� ������ ������ �н�Ƚ��, �����ð�, Ȱ������ ���� �ֽ��ϴ�. ");
	}

	/*
	 * public static void main(String args[]) throws Exception { Neymar neymar =
	 * new Neymar(); Messi messi = new Messi(); messi.appear(); messi.Time(60);
	 * messi.pass(50, 20); messi.pass("���н�", "���н�");
	 * 
	 * neymar.appear(); neymar.Time(70); neymar.pass(20, 15); neymar.pass("���н�",
	 * "���н�");
	 * 
	 * messi.result(); neymar.result();
	 * 
	 * }
	 */

}

class Messi extends Neymar {

	int time;
	int age;
	int pass;
	int longpassnum;
	int shortpassnum;
	int stamina;
	String name;
	String shortpass;
	String longpass;

	public Messi() {
		age = 28;
		stamina = 75;
		name = "�޽�";

	}

	public void appear() throws Exception {

		System.out.println(team + "�� " + age + "����" + name + "���� ���� �մϴ�. "
				+ "\n" + "\n");
		Thread.sleep(2000);
	}

	public void currentinfor(int time) {
		System.out.println("��� �ð��� " + (90 - time) + "�� ���ҽ��ϴ�. \n");
		System.out.println(name + "������ ü����" + stamina + " ���ҽ��ϴ�.");
		System.out
				.println(super.name + "������ ü����" + super.stamina + " ���ҽ��ϴ�.\n");
	}

	public void Time(int time) throws Exception {
		this.time = time;

		if (time < 90) {

			currentinfor(time);

			time += 10;
			stamina -= 5;
			Thread.sleep(2000);

		}

		if (time == 70) {
			super.appear();
			currentinfor(time);

			Thread.sleep(2000);
		}

		while (time < 90) {
			if (time >= 70) {

				time += 10;
				stamina -= 5;
				super.stamina -= 5;
				currentinfor(time);

				Thread.sleep(2000);

			}

		}

	}

	public void pass(int passmax, int passmin) {
		this.pass = (int) (Math.random() * (passmax - passmin + 1)) + passmin;

	}

	public void pass(String shortp, String longp) {

		int shor = (int) (Math.random() * this.pass);
		shortpass = shortp;
		longpass = longp;
		longpassnum = shor;
		shortpassnum = this.pass - shor;

	}

	public void result() {
		System.out.println(name + "������" + "\n" + "\n" + (90 - time)
				+ "�� �� �����ð��� ��" + pass + "���� �н��� �������׽��ϴ�.\n" + shortpassnum
				+ "���� " + shortpass + "�� " + longpassnum + "���� " + longpass
				+ "�� ���� ���׽��ϴ�.");
		System.out.println(name + "������ �� ������ "
				+ ((pass + (90 - this.time) + (100 - stamina)) * 0.04)
				+ " �� �Դϴ�.");
		System.out.println("�� ������ ������ �н�Ƚ��, �����ð�, Ȱ������ ���� �ֽ��ϴ�. " + "\n\n");
	}

	public static void main(String args[]) throws Exception {
		Neymar neymar = new Neymar();
		Messi messi = new Messi();

		messi.appear();
		messi.Time(60);
		messi.pass(50, 20);
		messi.pass("���н�", "���н�");

		neymar.pass(20, 15);
		neymar.pass("���н�", "���н�");

		messi.result();
		neymar.result();
	}

}
