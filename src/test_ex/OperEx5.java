package test_ex;

public class OperEx5 {
	public static void main(String args[]){
	/*
	������ ���� ������
	����)
		+=
		-=
		*=
		/=
		%=
		
	int a = 5;
	a %= 10; // a = a % 10;	
	 */
	// ex)
	int a = 0;
	int b = 0;
	int sum = 0;
	a = 10;
	b = 20;
	sum = a + b;
	sum += a;  // sum = sum + 10 -> 40
	sum -= b;  // sum = sum - 20 -> 20 
	
	System.out.println("��� :" + sum);
	
	}
}