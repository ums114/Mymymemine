package test_ex;

public class OperEx6 {
	public static void main(String args[]){
		
		/*
		증가, 감소 연산자
		형식) 
			--
			++
			int a = 0;
			
			++a;  //=> 결과 : 1
			--a;  //=> 결과 : 0
		*/
		// ex)
		
		int a = 0;
		
		System.out.println( a++ + a++);
		System.out.println(a + --a + ++a);
		System.out.println( --a +  a++);
		System.out.println(a);
		
		

	}
}
