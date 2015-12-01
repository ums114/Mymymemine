package test_ex;

interface Team {
	/**
	 * 감독명을 출력하는 기능 *String value @return
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
		name = "네이마르";
	}

	public void appear() throws Exception {

		System.out.println(team + "의 " + age + "세의" + name + "선수 출전 합니다."
				+ "\n\n");
		Thread.sleep(2000);
	}

	public void Time(int time) throws Exception {
		this.time = time;
		while (true) {
			if (time < 90) {

				System.out.println("경기 시간이 " + (90 - time) + "분 남았습니다.");
				System.out.println(name + "선수의 체력이" + stamina + " 남았습니다. ");
				System.out.println();
				time += 10;
				stamina -= 5;
				Thread.sleep(2000);

			} else {
				System.out.print("경기가 끝났습니다.");
				Thread.sleep(2000);
				break;
			}

		}
		System.out.println("\n" + name + "선수는 부상에서 완벽히 회복하지 않은듯 보입니다.");
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
		System.out.println(name + "선수는" + "\n" + "\n" + (90 - time)
				+ "분 의 출전시간과 총" + pass + "번의 패스를 성공시켰습니다.\n" + shortpassnum
				+ "번의 " + shortpass + "와 " + longpassnum + "번의 " + longpass
				+ "를 성공 시켰습니다.");
		System.out.println(name + "선수의 총 평점은 "
				+ ((pass + (90 - this.time) + (100 - stamina)) * 0.04)
				+ " 점 입니다.");
		System.out.println("이 점수는 성공한 패스횟수, 출전시간, 활동량과 관련 있습니다. ");
	}

	/*
	 * public static void main(String args[]) throws Exception { Neymar neymar =
	 * new Neymar(); Messi messi = new Messi(); messi.appear(); messi.Time(60);
	 * messi.pass(50, 20); messi.pass("숏패스", "롱패스");
	 * 
	 * neymar.appear(); neymar.Time(70); neymar.pass(20, 15); neymar.pass("숏패스",
	 * "롱패스");
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
		name = "메시";

	}

	public void appear() throws Exception {

		System.out.println(team + "의 " + age + "세의" + name + "선수 출전 합니다. "
				+ "\n" + "\n");
		Thread.sleep(2000);
	}

	public void currentinfor(int time) {
		System.out.println("경기 시간이 " + (90 - time) + "분 남았습니다. \n");
		System.out.println(name + "선수의 체력이" + stamina + " 남았습니다.");
		System.out
				.println(super.name + "선수의 체력이" + super.stamina + " 남았습니다.\n");
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
		System.out.println(name + "선수는" + "\n" + "\n" + (90 - time)
				+ "분 의 출전시간과 총" + pass + "번의 패스를 성공시켰습니다.\n" + shortpassnum
				+ "번의 " + shortpass + "와 " + longpassnum + "번의 " + longpass
				+ "를 성공 시켰습니다.");
		System.out.println(name + "선수의 총 평점은 "
				+ ((pass + (90 - this.time) + (100 - stamina)) * 0.04)
				+ " 점 입니다.");
		System.out.println("이 점수는 성공한 패스횟수, 출전시간, 활동량과 관련 있습니다. " + "\n\n");
	}

	public static void main(String args[]) throws Exception {
		Neymar neymar = new Neymar();
		Messi messi = new Messi();

		messi.appear();
		messi.Time(60);
		messi.pass(50, 20);
		messi.pass("숏패스", "롱패스");

		neymar.pass(20, 15);
		neymar.pass("숏패스", "롱패스");

		messi.result();
		neymar.result();
	}

}
