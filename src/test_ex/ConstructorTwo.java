package test_ex;

public class ConstructorTwo {
	public ConstructorTwo(){
		this(50, "ȫ�浿");
		System.out.println("Constructor!!");
	}
	public ConstructorTwo(int a){
		System.out.println("Constructor!!" + a);
	}
	public ConstructorTwo(int a, String s){
		System.out.println("Constructor!!"+ s);
	}
	
	
	public static void main(String args[]){
		System.out.println("Constructor Test");
		new ConstructorTwo();
	}
}
