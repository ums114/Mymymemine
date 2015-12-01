package test_ex;

public class OperEx2 {
	public static void main(String args[]){
	/*비교 연산자
	<
	>
	<=
	>=
	==
	!=
	!
	instanceof*/
	//ex
	int x = 30;
	int y = 20;
	boolean result = x < y;
	boolean result2 = x > y;
	boolean result3 = x <= y; 
	boolean result4 = x >= y;
	boolean result5 = x == y;
	boolean result6 =  x != y;
	boolean result7 = ! result;
	 
	System.out.println("결과1 : " + result);
	System.out.println("결과2 : " + result2);
	System.out.println("결과3 : " + result3);
	System.out.println("결과4 : " + result4);
	System.out.println("결과5 : " + result5);
	System.out.println("결과6 : " + result6);
	System.out.println("결과7 : " + result7);

	}
}
