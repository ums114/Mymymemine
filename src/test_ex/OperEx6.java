package test_ex;

public class OperEx6 {
	public static void main(String args[]){
		
		/*
		����, ���� ������
		����) 
			--
			++
			int a = 0;
			
			++a;  //=> ��� : 1
			--a;  //=> ��� : 0
		*/
		// ex)
		
		int a = 0;
		
		System.out.println( a++ + a++);
		System.out.println(a + --a + ++a);
		System.out.println( --a +  a++);
		System.out.println(a);
		
		

	}
}
