public class AnimalOne {
	int age;
	String name;

	public void bark() {
		System.out.println("�ܲ�~");
	}

	public void setAge(int age) {
		this.age = age;

	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String args[]) {
		AnimalOne animal = new AnimalOne();
		animal.setAge(10);
		animal.setName("����");
		System.out.println(animal.name + "�� ���̴� " + animal.age);
		animal.bark();

	}

}