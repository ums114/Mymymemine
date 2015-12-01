public class ABC {
	public String msg = "A";

	public void print() {
		BC bc = new BC();
		bc.print();
	}

	public class BC {
		public String msg = "B";

		public void print() {
			C c = new C();
			c.print();
		}

		public void aa() {
			System.out.println("aaaa");
		}

		public class C {
			public String msg = "C";

			public void print() {
				System.out.println(msg);
				System.out.println(this.msg);
				System.out.println(C.this.msg);
				System.out.println(BC.this.msg);
				System.out.println(ABC.this.msg);

			}
		}
	}

	public static void main(String args[]) {
		ABC abc = new ABC();
		abc.print();
	}

}
