package java8_Concepts;

import org.testng.annotations.Test;

public class IPrintableTest {

	@Test
	public void test() {
		
		//anonymous inner class concept
		IPrintable obj= new IPrintable() {

			@Override
			public void print() {
				System.out.println("from anonymous inner class");

			}
		};
		obj.print();

		// Functional programming
		// instead of above piece code, we can reduce to lesser as well.
		// Lambda Operator
		// Shortcut to convert a Anonymous inner class to Lambda is --ctrl + 1
		// Following points should match
			// 1. Parameters of Abstract Method & lambda expression should match
			// 2. Return type of Abstract Method & lambda expression should match
			// 3. Interface should have only one abstract/unimplemented method
		IPrintable obj1 = () -> System.out.println("print function is called using Lambda operator");
		obj1.print();

	}
}