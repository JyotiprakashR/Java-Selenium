package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetInterf {

	public static void printLineBreaker(int i) {
		System.out.println("--------------------"+i);
	}
	public static void main(String a[]) {

		
		Set<String> set= new HashSet<>();
		set.add("Helo");
		set.add("Tom");
		set.add(null);
		set.add(null);
		set.add("Tom");
		set.add("ToM");
		
		System.out.println(set);
		System.out.println("--------------------1");
		for(String s: set) {
			System.out.println(s);
		}
		System.out.println("--------------------2");
		set.add("Lily");
		List<String> list=new ArrayList<>();
		list.add("Ben");
		set.addAll(list);
		set.forEach(e->System.out.println(e));
		System.out.println("--------------------3");
//		set.clear();
//		set.forEach(System.out::println);
//		System.out.println(set);
		
		System.out.println(set.contains("Tom"));
		System.out.println(set.contains(""));
		System.out.println(set.contains(null));
		
		printLineBreaker(4);
		set.add("");
		System.out.println(set.isEmpty());
		Iterator<String> itr=set.iterator();
		itr.forEachRemaining(e->System.out.println(e));
		
		printLineBreaker(5);
		System.out.println("---"+set.remove("TOM"));
		set.forEach(System.out::println);
		
		printLineBreaker(6);
		//set.removeAll(list);
		System.out.println(set);
		
		printLineBreaker(7);
		set.stream().filter(e->!(e==null)).sorted().forEach(System.out::println);;
		System.out.println(set);
		
		printLineBreaker(8);
		//set.retainAll(list);
		System.out.println(set);
		
		printLineBreaker(9);
		Object[] strArr= set.toArray();
		String[] strA=new String[9];
		set.toArray(strA);
		
		printLineBreaker(10);
		Set<SetInterfCustomClass> setCus=new HashSet<>();
		setCus.add(new SetInterfCustomClass("Ben","Stokes",12));
		
		setCus.forEach(e->System.out.println(e.fName+" "+e.lName+" "+e.age));
		
	}

}
