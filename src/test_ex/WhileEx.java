package test_ex;

public class WhileEx {
	public static void main(String args[]) {
		/*
		 *  �ݺ��� ǥ��)
		 *  while(���ǽ�)
		 *  { ���� ����; }
		 */
		java.util.Scanner scan = 
				new java.util.Scanner(System.in);
		System.out.print("�ݺ� ���� :");
		int result = scan.nextInt();
		
		int count = 0;
		while( count < result ){
			count++;
			System.out.println("���� ����"+ count);
		}

	}
}
