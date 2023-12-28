package collectionFramework;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterf {
	
	
	public static void main(String a[]) {
		
		SortedSet<Object> sort= new TreeSet<>();
		
		
		sort.add("Heollo");		
		sort.add("Tom");		
		//sort.add(null); // As it stores the values according to some sorting order
		sort.add("Ben");
		sort.add("Lily");
		sort.add("Joe");
		
		System.out.println(sort);
		
		System.out.println(sort.headSet("Tom"));
		System.out.println(sort.tailSet("Ben"));
		System.out.println(sort.first());
		System.out.println(sort.last());
		
		System.out.println(sort.comparator());
		
		Comparator<Object> cop= sort.comparator();
		
		
		
		
		
		
	}

}
