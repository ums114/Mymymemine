abstract class Abs {
	int a = 10;

	public void setA() {
		System.out.println("�Ϲ����� �޼��� ����.....");
	}

	public abstract int getA();
}

public class AbstractOne extends Abs {

	public int getA() {
		System.out.println("�߻� �޼��� ������...");
		return 100;
	}

	public static void main(String args[]) {
		AbstractOne at = new AbstractOne();
		Abs a = at;
		a.setA();
		a.getA();

	}
}