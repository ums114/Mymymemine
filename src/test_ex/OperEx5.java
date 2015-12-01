package test_ex;

public class OperEx5 {
	public static void main(String args[]){
	/*
	연산후 대입 연산자
	형식)
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
	
	System.out.println("결과 :" + sum);
	
	}
}