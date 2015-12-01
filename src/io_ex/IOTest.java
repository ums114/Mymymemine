package io_ex;

public class IOTest {

	public static void main(String args[]){
		System.out.print("입력 : "); //1자만 입`출력
		char ch = 'a';
		try {
			ch = (char)System.in.read();
			
		}catch (Exception e){
			System.out.println("Exception :" + e.getMessage());
		}
		System.out.println("출력 : " + ch);
	}
}