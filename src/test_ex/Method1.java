package test_ex;

public class Method1 {
//	�޼ҵ�

/*
	-[����������][������][��ȯ��] �޼ҵ� �� (���ڵ�){
	���� ����(����);
   	}
	���� ������(Modifiers) : private, default(friendly),
							protected, public
	������ : static, final, abstract, native ...
	
	��ȯ��(return type) :
		- �ڹ� ������ �ڷ���(�⺻��, ������) ���� ����� �� ����.
		-void : ��ȯ���� ���� �޼ҵ� ���ǽ� ���.
	�޼ҵ� �� : �ĺ��ڷ� ������ �̸� ����.
	����(Arguments) : �Ű� ������� �ϸ� �żҵ� ȣ��� �����͸� 
					  ���� �ϱ� ���� �뵵�� �����.
	
	ǥ�� - 1)
	public		 int	 intA(){
  [����������]   [��ȯ��] [�޼ҵ��]
		����;
		return n; //n -> int �⺻ �ڷ����� �´� ������ ��ȯ(��ȯ���� �ִ� �޼ҵ�� �ݵ�� return ���� ���ϴ�(��������) ���)
	}
	
	
	ǥ�� - 2)
	public void intB(int a, ...) {
		����;
		//return ������ ������� ����.
	]
*/	
	
	
	
	
	
	
	public int intA(){
		int num = 10;
		System.out.println("intA �޼ҵ� ����");
		return num;
	}
	
	public void intB(){
		System.out.println("intB �޼ҵ� ����");
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
		//�޼ҵ� ȣ��
		int result = m.intA();
		
		//�޼ҵ� m.intB();ȣ�� ���� ��ȯ �� Ȯ��
		System.out.println("��ȯ �� : " + result);
		
		//result = m.intC(5,10);
		//System.out.println("��� : " + result);
	}
	
	
	/*
	�ǽ����� 
	
	1. �������� ����Ͻÿ�. ( �޼ҵ� ���)
	ex) void gugudan(int dan)
	
	*/
	
	
	
	
	
	
	
}
