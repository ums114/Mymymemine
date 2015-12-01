package test_ex;

public class OperEx4 {
	public static void main(String args[]){
	/*
		논리 연산자
		|
		&
		||
		&&
	*/
	//ex)
	int su1 = 10;
	int su2 = 20;
	boolean result1 = su1 < su2;
	System.out.println(result1);
	boolean result2 = su1 > su2;
	System.out.println(result2);
	boolean result3 = result1 | result2;
	System.out.println(result3);
	boolean result4
		=su1 < su2 || (su1 = 5) > su2;
	System.out.println(result4);
	System.out.println("su1 =" + su1);
	
	boolean result5 = su1 > su2 && su1 < (su2 = 5 + 5);
	System.out.println(result5);
	System.out.println("su2 =" + su2);
	
		
	
	}

}
