package collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeClassSorting implements Comparable<EmployeeClassSorting> {

	String name;
	int id;

	public EmployeeClassSorting(String name, int age) {
		this.name = name;
		this.id = age;
	}

	@Override
	public String toString() {
		return name + " : " + id;
	}

	@Override
	public int compareTo(EmployeeClassSorting o) {
		int eid1 = this.id;
		EmployeeClassSorting e = (EmployeeClassSorting) o;
		int eid2 = e.id;
		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String a[]) {
		TreeSet<EmployeeClassSorting> treeSetObj = new TreeSet<>();
		treeSetObj.add(new EmployeeClassSorting("Tom", 452));
		treeSetObj.add(new EmployeeClassSorting("Joe", 105));
		treeSetObj.add(new EmployeeClassSorting("Ben", 6589));
		treeSetObj.add(new EmployeeClassSorting("ABC", 25));

		System.out.println(treeSetObj);

		Comparator<EmployeeClassSorting> comp = new Comparator<EmployeeClassSorting>() {

			@Override
			public int compare(EmployeeClassSorting o1, EmployeeClassSorting o2) {
				if (o1.id < o2.id) {
					return 1;
				} else if (o1.id > o2.id) {
					return -1;
				}
				return 0;
			}
		};
		// or
		Comparator<EmployeeClassSorting> comp1 = (t, b) -> {
			return -t.compareTo(b);
		};

		TreeSet<EmployeeClassSorting> treeSetObj1 = new TreeSet<>(comp);
		treeSetObj1.add(new EmployeeClassSorting("Tom", 452));
		treeSetObj1.add(new EmployeeClassSorting("Joe", 105));
		treeSetObj1.add(new EmployeeClassSorting("Ben", 6589));
		treeSetObj1.add(new EmployeeClassSorting("ABC", 25));

		System.out.println(treeSetObj1);

		Comparator<Object> comp11 = (o1, o2) -> {
			EmployeeClassSorting o11 = (EmployeeClassSorting) o1;
			EmployeeClassSorting o12 = (EmployeeClassSorting) o2;
			String s11=o11.name;
			String s12=o12.name;
			return s11.compareTo(s12);
		};

		TreeSet<EmployeeClassSorting> treeSetObj11 = new TreeSet<>(comp11);
		treeSetObj11.add(new EmployeeClassSorting("Tom", 452));
		treeSetObj11.add(new EmployeeClassSorting("Joe", 105));
		treeSetObj11.add(new EmployeeClassSorting("Ben", 6589));
		treeSetObj11.add(new EmployeeClassSorting("ABC", 25));
		System.out.println(treeSetObj11);
	}

}
