package test_ex;

public class Method1 {
//	메소드

/*
	-[접근제어자][수정자][반환형] 메소드 명 (인자들){
	실행 구문(구현);
   	}
	접근 제어자(Modifiers) : private, default(friendly),
							protected, public
	수정자 : static, final, abstract, native ...
	
	반환형(return type) :
		- 자바 데이터 자료형(기본형, 참조형) 전부 사용할 수 있음.
		-void : 반환형이 없는 메소드 정의시 사용.
	메소드 명 : 식별자로 임의의 이름 정의.
	인자(Arguments) : 매개 변수라고 하며 매소드 호출시 데이터를 
					  전달 하기 위한 용도로 사용함.
	
	표현 - 1)
	public		 int	 intA(){
  [접근제어자]   [반환형] [메소드명]
		구현;
		return n; //n -> int 기본 자료형에 맞는 데이터 반환(반환값이 있는 메소드는 반드시 return 값을 최하단(마지막에) 사용)
	}
	
	
	표현 - 2)
	public void intB(int a, ...) {
		구현;
		//return 구문을 사용하지 않음.
	]
*/	
	
	
	
	
	
	
	public int intA(){
		int num = 10;
		System.out.println("intA 메소드 실행");
		return num;
	}
	
	public void intB(){
		System.out.println("intB 메소드 실행");
	}
	
	
	
	
	
	/*
	// add
	public int intC(int su, int su2){
		int result = su;
		result += su2;    result = result + 10
				return result;
	}
	*/
	
	
	public static void main(String args[]){
		Method1 m = new Method1();
		//메소드 호출
		int result = m.intA();
		
		//메소드 m.intB();호출 이후 반환 값 확인
		System.out.println("반환 값 : " + result);
		
		//result = m.intC(5,10);
		//System.out.println("결과 : " + result);
	}
	
	
	/*
	실습문제 
	
	1. 구구단을 출력하시오. ( 메소드 사용)
	ex) void gugudan(int dan)
	
	*/
	
	
	
	
	
	
	
}
