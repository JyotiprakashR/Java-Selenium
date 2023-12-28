package collectionFramework;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Spliterator;

public class HashSetClass {

	
	public static void main(String a[]) {
		HashSet<String> hashSet= new HashSet<>();
		
		HashSet<String> hashSet1= new HashSet<>(10);

		HashSet<String> hashSet2= new HashSet<>(10,2);
		
		HashSet<String> hashSet3= new HashSet<>(new LinkedList<>());
	
		hashSet.add("Hello");
		hashSet.add("Hello");
		hashSet.add("Tom");
		hashSet.add("Ben");
		hashSet.add(null);
		hashSet.add("");
		System.out.println(hashSet);
		
		Spliterator<String> splItr=hashSet.spliterator();
		System.out.println(splItr.characteristics());
		System.out.println(splItr.estimateSize());
		splItr.forEachRemaining(e->System.out.println(e));
//		Comparator<? super String> comp =splItr.getComparator();
//		System.out.println(comp);
		System.out.println(splItr.getExactSizeIfKnown());
		System.out.println(splItr.hasCharacteristics('c'));
		
		System.out.println(splItr.tryAdvance(e->e.concat("H")));
		
	}
}
