package test_ex;

public class ArrayThree {
	public static void main(String args[]) {
		// 다차원 배열 (array) 행과 열

		/*
		 * int[][] arr = new int[n][n]; // n값 만큼 만들어 줘라. 
		 *  
		 * int[][] arr = {{n,n}, {n,n}, {n,n}}; // n값을 지정 저장.
		 */

		int[][] arr = new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;
		System.out.println("arr[0][0] :" + arr[0][0]);
		System.out.println("arr[0][1] :" + arr[0][1]);
		System.out.println("arr[1][0] :" + arr[1][0]);
		System.out.println("arr[1][1] :" + arr[1][1]);
		System.out.println("arr[2][0] :" + arr[2][0]);
		System.out.println("arr[2][0] :" + arr[2][1]);

		
		
		int[][] arr2 = {{10,20}, 
						{30,40}, 
						{50,60}};
		
		System.out.println("arr2[0][0] :" + arr2[0][0]);
		System.out.println("arr2[0][1] :" + arr2[0][1]);
		System.out.println("arr2[1][0] :" + arr2[1][0]);
		System.out.println("arr2[1][1] :" + arr2[1][1]);
		System.out.println("arr2[2][0] :" + arr2[2][0]);
		System.out.println("arr2[2][0] :" + arr2[2][1]);
		System.out.println();
		
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}

		}
		System.out.println();
		
		
		// 5.0 향상된 for
		/*
		 * int[] arr = new int[]{ 1, 2, 3 };
		for (int a : arr) {
			System.out.println(a);
		*/
		
		for(int[] i  : arr){ 
			for(int j : i ){
				System.out.println(j);
			}
		}
		
		
		
		
		
		
		
	}
}
