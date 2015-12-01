public class AnimalOne {
	int age;
	String name;

	public void bark() {
		System.out.println("²Ü²Ü~");
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
		animal.setName("µÅÁö");
		System.out.println(animal.name + "ÀÇ ³ªÀÌ´Â " + animal.age);
		animal.bark();

	}

}