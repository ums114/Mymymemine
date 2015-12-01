package test_ex;

public class WhileEx {
	public static void main(String args[]) {
		/*
		 *  반복문 표현)
		 *  while(조건식)
		 *  { 실행 구문; }
		 */
		java.util.Scanner scan = 
				new java.util.Scanner(System.in);
		System.out.print("반복 제한 :");
		int result = scan.nextInt();
		
		int count = 0;
		while( count < result ){
			count++;
			System.out.println("실행 구문"+ count);
		}

	}
}
