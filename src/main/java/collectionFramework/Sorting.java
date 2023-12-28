package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Sorting {

	public static void main(String a[]) {

		String value = "Hello";
		String[] atrArr = value.split("");
		List<String> listA = Arrays.asList(atrArr);
		TreeSet<String> tr = new TreeSet<>(listA);
		System.out.println(tr);

		Comparator<Integer> comparator = new Comparator<Integer>() { // Custom natural sorting order--CSO

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				}
				return 0;
			}
		};
		// OR
		Comparator<Integer> comparator1 = (m, n) -> -m.compareTo(n); // CSO--Customized sorting order

		Comparator<Integer> comparator2 = (m, n) -> m.compareTo(n); // DNSO--defalut natural sorting order
		Comparator<String> comparator3 = (m, n) -> n.compareTo(m); // CSO
		Comparator<Integer> comparator4 = (m, n) -> -n.compareTo(m); // DNSO
		Comparator<Integer> comparator5 = (c, b) -> 1; // Insertion order with duplicates are allowed
		Comparator<Integer> comparator6 = (c, b) -> -1; // Reverse of Insertion order
		Comparator<Integer> comparator7 = (c, b) -> 0; // Only first element will be inserted & all remaining are
														// duplicates

		TreeSet<Integer> tree1 = new TreeSet<>(comparator1);
		tree1.add(25);
		tree1.add(0);
		tree1.add(19);
		tree1.add(56);
		tree1.add(33);
		System.out.println(tree1);

		TreeSet<Integer> tree2 = new TreeSet<>();
		tree2.add(25);
		tree2.add(0);
		tree2.add(19);
		System.out.println(tree2);

		Comparable<Integer> comparable = new Comparable<Integer>() { // default natural sorting order

			@Override
			public int compareTo(Integer o) {
				return 0;
			}
		};

		TreeSet<Integer> tree6 = new TreeSet<>(comparator1);
		tree6.add(25);
		tree6.add(0);
		tree6.add(19);
		tree6.add(56);
		tree6.add(33);
		System.out.println(tree6);

		TreeSet<String> tree5 = new TreeSet<>((s, t) -> -s.compareTo(t));
		tree5.add("C");
		tree5.add("A");
		tree5.add("Z");
		tree5.add("D");

		System.out.println(tree5);

		Comparator<Object> compaa = new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() < o2.toString().length()) {
					return -1;
				} else if (o1.toString().length() > o2.toString().length()) {
					return 1;
				} else {
					return o1.toString().compareTo(o2.toString());
				}

			}
		};
		TreeSet<Object> treeSet = new TreeSet<>(compaa);
		treeSet.add("M");
		treeSet.add("ABCF");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("ABC");
		treeSet.add("AA");
		treeSet.add("XX");
		System.out.println(treeSet);

	}

}
