package test_ex;

public class ArrayOne {
	public static void main(String args[]) {

		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[0] : " + arr[1]);
		System.out.println("arr[0] : " + arr[2]);

		int[] arr2 = { 1, 2, 3 };
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);

		
		int[] arr3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int a : arr3) {
			System.out.println(a);

		}
		
		
		int[] arr4 = new int[10]; 
		for(int i = 0; i < 10; i++){
			arr4[i] = i + 1;
			System.out.println(arr4[i]);		
		}
		
	}

}
