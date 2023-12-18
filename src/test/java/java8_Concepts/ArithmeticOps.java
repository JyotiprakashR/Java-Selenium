package java8_Concepts;

import java.util.EmptyStackException;
import java.util.function.*;

import org.testng.annotations.Test;

public class ArithmeticOps {

	@Test
	public void test() {

		// BiConsumer FunctionalInterface--takes 2 arguments, returns no result
		BiConsumer<Integer, Integer> obj = (a, b) -> {
			System.out.println("sum is--" + (a + b));
		};
		obj.accept(20, 30);

		// Consumer FunctionalInterface---takes one argument, returns no result
		Consumer<String> obj1 = (a) -> {
			System.out.println(a);
		};
		obj1.accept("hello");

		// Function FunctionalInterface---takes one argument, produces one result
		Function<String, Integer> con = a -> {

			if (a == null) {
				System.out.println("null is entered");
				throw new NullPointerException(a);
			} else if (a.length() == 0) {
				System.out.println("invalid string");
				throw new IndexOutOfBoundsException();
			} else if (a.isBlank()) {
				System.out.println("given string is blank");
				throw new EmptyStackException();
			} else if (a.isEmpty()) {
				System.out.println("given string is empty");
				throw new EmptyStackException();
			} else {
				return a.length();
			}
		};	

		System.out.println(con.apply("Welcome"));
		//con.apply("");
		// con.apply(null);
		//con.apply(" ");
		
		// BIFunction FunctionalInterface---takes two arguments, produces one result
		BiFunction<Object, Object, Integer> b =(a, f)->{return (int) ((Integer)a+(Double)f);};
		System.out.println(b.apply(20, 30.3));

		
		// Predicate FunctionalInterface--takes one argument & returns one boolean result
		Predicate<String> pred=a->a.contains("a");
		System.out.println(pred.test("hello"));
		
		// Supplier FunctionalInterface--takes no argument & returns one result
		Supplier<Double> s = () -> Math.random();
		System.out.println(s.get());
		
		
	}

}
