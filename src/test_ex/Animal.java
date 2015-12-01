package test_ex;

public class Animal {
	String name;
	int age;

	public Animal() {

	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void bark() {
		System.out.println("�п�");
	}

	public static void main(String args[]) {
		Animal animal = new Animal();
	}

}

class Dog extends Animal {
	String name;
	int age;

	public Dog() {
		this.name = "";
		this.age = 0;
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void bark() {

		System.out.println(age + "���� " + name + "�� �п�");

	}

	public static void main(String args[]) {
		Dog a = new Dog();
		Dog b = new Dog("������", 2);
		b.bark();

	}

}

class Cat extends Dog {
	String name;

	public Cat() {
		this.name = "";
		this.age = 0;
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void bark() {
		System.out.println(age + "���� " + name + "�� �߿�");

	}

	public static void main(String args[]) {
		Cat cat = new Cat();
		Animal animal = cat;
		animal.bark();
	}

}
