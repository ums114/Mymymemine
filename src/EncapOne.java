public class EncapOne {

	public static void main(String args[]) {
		A obj = new A();
		/*
		 * System.out.println("���1" + obj.d); 
		 * System.out.println("���1" + obj.c);
		 * System.out.println("���1" + obj.b); 
		 * //System.out.println("���1" +	  obj.a);
		 */

	}

}

class A {
	private String a;
	String b;
	protected String c;
	public String d;

	public static void main(String args[]) {
		AA a = new AA();
		a.setId("001");
		String id = a.getId();
		System.out.println(id + "�� ���� �Ǿ����ϴ�.");

	}

}

class AA {
	private String id;

	public void setId(String id) {
		this.id = id;

	}

	public String getId() {
		return this.id;

	}

}
