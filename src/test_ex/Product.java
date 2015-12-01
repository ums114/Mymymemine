package test_ex;

public class Product {
	String name;
	int price;

	 Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	 Product(String n) {
		this(n, 800);
	}

	 Product(int p) {
		this("��", p);
	}

	public Product() {
		this("��");
	}

	public static void main(String args[]) {
		Product p1 = new Product("��ġ��", 700);
		Product p2 = new Product("Ŀ��");
		Product p3 = new Product(500);
		Product p4 = new Product();
		System.out.println(p1.name + ", " + p1.price);
		System.out.println(p2.name + ", " + p2.price);
		System.out.println(p3.name + ", " + p3.price);
		System.out.println(p4.name + ", " + p4.price);

	}

}
