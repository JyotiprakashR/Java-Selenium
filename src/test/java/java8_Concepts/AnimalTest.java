package java8_Concepts;

import java.util.function.Consumer;

public class AnimalTest {

	public static void perform(Animal animal) {
		animal.run();

	}

	public static void perform1(Animal1 animal1) {
		animal1.run();
	}

	public static void main(String q[]) {
		Animal animal = new Dog();
		perform(animal);
		// or
		// perform(new Dog());

		Animal1 animal3 = new Lion();
		perform1(animal3);
		// or
		// perform1(new Lion());

		Animal animal2 = new Cat();
		perform(animal2);

		Animal ani = () -> {
			System.out.println("runnig at 150/kmph");
		};
		perform(ani);
		// or
		perform(() -> {
			System.out.println("runnig at 170/kmph");
		});

		toUpper("heLLo");

		stringOperations((a) -> {
			System.out.println(a.toLowerCase());
			System.out.println(a.toUpperCase());
		});

	}

	private static void stringOperations(Consumer<String> con) {
		con.accept("hello");
	}

	private static void toUpper(String s) {
		System.out.println(s.toUpperCase());

	}

}
