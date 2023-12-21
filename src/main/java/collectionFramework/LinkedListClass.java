package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> li= new LinkedList<>();
		// insertion order is preserved
		// but nodes are not consutively placed
		// SO it doesnot implement RandomAccess Interface
		// So, if our primary goal is to insertion/deletion in the middle Linkedlist is best for the case
		
		li.add("Tom");
		li.add("hello");
		li.add(null);
		li.add("Tom");
		li.add("");
		
		System.out.println(li);
		System.out.println(li.get(1));
		
		
		li.add(2, "Lily");
		System.out.println(li);
		
		li.addFirst("Ben");
		li.addLast("Joe");
		System.out.println(li.size());
		System.out.println(li);
		System.out.println("-----------------------------------------");
		Iterator<String>itr= li.descendingIterator(); // will print te values in decending order
		itr.forEachRemaining(e->System.out.println(e));
		
		System.out.println(li.getFirst()); // methods from Deque interface
		
		System.out.println(li.getLast());
		//li.sort();
		
		
	}

}
