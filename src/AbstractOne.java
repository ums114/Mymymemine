abstract class Abs {
	int a = 10;

	public void setA() {
		System.out.println("일반적인 메서드 실행.....");
	}

	public abstract int getA();
}

public class AbstractOne extends Abs {

	public int getA() {
		System.out.println("추상 메서드 재정의...");
		return 100;
	}

	public static void main(String args[]) {
		AbstractOne at = new AbstractOne();
		Abs a = at;
		a.setA();
		a.getA();

	}
}