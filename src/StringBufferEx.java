public class StringBufferEx {
	public static void main(String args[]) {

		StringBuffer sb = new StringBuffer();  //lang ��Ű���� �ִ� Ŭ������ ����Ʈ�� �ʿ� ����. 
		sb.append("ȯ��");
		sb.append("�մϴ�. ");
		sb.append("java ");
		sb.append("application programming");

		String result = sb.toString();

		System.out.println("��� : " + result);
		System.out.println("���� : " + sb.length());
		System.out.println("�뷮 : " + sb.capacity());

	}

}
