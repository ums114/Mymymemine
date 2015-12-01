package test_ex;

public class ForContinueEx {
	public static void main(String args[]) {
		int k = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("반복 실행문");
			k++;
			
			if (k > 4) {
				continue;
			}
		}
		System.out.println("반복 실행 제한");

		
	
		
		
		// 5.0 향상된 for
		int[] arr = new int[]{ 1, 2, 3 };
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
