package collectionFramework;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String a[]) {

		String s = "Hello";

		System.out.println(s.compareTo("he"));

		TreeSet<Object> trr = new TreeSet<>();

		TreeSet<Object> trr1 = new TreeSet<>(new LinkedHashSet<>());

		SortedSet<Object> so = new TreeSet<>(); // object so SortedSet Interface

		TreeSet<Object> trr2 = new TreeSet<>(so);

		Comparator<Integer> co = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return -1;
				} else if (o1 < o2) {
					return 1;
				} else {
					return 0;
				}
			}
		};
		
		Comparator<Integer> co1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		TreeSet<Integer> trr3 = new TreeSet<>(co);
		
		trr3.add(20);
		trr3.add(1);
		trr3.add(50);
		trr3.add(20);
		trr3.add(0);
		trr3.add(59);
		System.out.println(trr3);

		
		TreeSet<Integer> trr4 = new TreeSet<>();
		
		trr4.add(20);
		trr4.add(1);
		trr4.add(50);
		trr4.add(20);
		trr4.add(0);
		trr4.add(59);
		System.out.println(trr4);
		
		
		TreeSet<StringBuffer> trr5 = new TreeSet<>();
		
		trr5.add(new StringBuffer("Z"));
		trr5.add(new StringBuffer("A"));
		trr5.add(new StringBuffer("B"));
		trr5.add(new StringBuffer("D"));
		trr5.add(new StringBuffer("M"));
		trr5.add(new StringBuffer("4"));
		System.out.println(trr5);
		

	}

}
