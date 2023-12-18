package java_Concepts;

public class Car extends Engineering {

	public void enginee() {
		System.out.println("Enginee");
	}

	public static void main(String[] a) {
		new Car().enginee();
		new Car().physics();
		new Car().math(10);

		new Car().subject1();

	}

}
