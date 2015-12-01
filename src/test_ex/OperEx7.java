package test_ex;

public class OperEx7 {
	public static void main(String args[]){
		
		int i = 10;
		System.out.println("i= "+i+"\t++i = "+ ++i +
							"\ti++ = "+ i++ +"\ti = "+i);
		i = 3;
		
		System.out.println("i = 3: i++ + i++ + --i = ? " +
							(i++ + i++ + --i));
//	
		int j = 20;
		int sum = i - j;
		boolean result = sum < 0;
		System.out.println("첫번째 결과 : " + result);
		result = sum > j || result;
		System.out.println("두번째 결과 : " + result);
	}

}
