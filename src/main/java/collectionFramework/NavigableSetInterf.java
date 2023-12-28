package collectionFramework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterf {
	
	public static void main(String a[]) {
		
		NavigableSet<Object> nav= new TreeSet<>();
		
		nav.add("Heollo");		
		nav.add("Tom");		
		//nav.add(null); // As it stores the values according to some sorting order
		nav.add("Ben");
		nav.add("Lily");
		nav.add("Joe");
		nav.add("Joe");
		
		System.out.println(nav);
		
		System.out.println(nav.lower("He"));
		
		System.out.println(nav.higher("To"));
		
		System.out.println(nav.ceiling("Li"));
		System.out.println(nav.floor("Jo"));
		
		System.out.println(nav.pollFirst());
		System.out.println(nav.pollLast());
		
		NavigableSet<Object> s=nav.descendingSet();
		System.out.println(s);
		
		
		
		
	}

}
