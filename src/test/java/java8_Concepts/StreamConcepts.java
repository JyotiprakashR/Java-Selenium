package java8_Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamConcepts {

	@Test
	public void tets() {
		List<Integer> list = Arrays.asList(12, 20, 20, 26, 1, 0, 89, 20);
		/*
		 * list.forEach( (a)->{System.out.println(a);} ); System.out.println("---");
		 * 
		 * Collections.sort(list); list.forEach(e->System.out.println(e));
		 * System.out.println("---");
		 */
		list.forEach(a -> System.out.println(a));
		System.out.println("=====");
		list.forEach(System.out::println);
		
		System.out.println("count--" + list.stream().count());
		System.out.println("count--" + list.parallelStream().count());

		// list.stream().distinct().forEachOrdered(e->System.out.println(e));

		list.parallelStream().filter(e -> (e % 2 == 0)).collect(Collectors.toList()).forEach(System.out::println);
//		System.out.println(list.stream().filter(e -> (e / 2 == 6)).collect(Collectors.toSet()));
//
//		int a = 8;
//		int b = 4;
//		System.out.println(a / b + " : " + a % b);
//		BiPredicate<Integer, Integer> biPredicate = (g, h) -> (g == h);
//		System.out.println(biPredicate.test(20, 50));
//		System.out.println(biPredicate.test(20, 20));

	}

}
