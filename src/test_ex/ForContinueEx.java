package test_ex;

public class ForContinueEx {
	public static void main(String args[]) {
		int k = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("�ݺ� ���๮");
			k++;
			
			if (k > 4) {
				continue;
			}
		}
		System.out.println("�ݺ� ���� ����");

		
	
		
		
		// 5.0 ���� for
		int[] arr = new int[]{ 1, 2, 3 };
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
