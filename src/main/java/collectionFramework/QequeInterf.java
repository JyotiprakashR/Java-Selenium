package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class QequeInterf {

	public static void main(String a[]) {
	Deque<String> deque = new ArrayDeque<>();

// Deque Interface methods
	// 1. INSERTION 
	deque.addFirst("ABC"); // Adds to the HEAD of the deque & throwing an IllegalStateException if no space is currently available.
	deque.offerFirst("DEF"); // true if the element was added to this deque, else false
	deque.addFirst("ABC");
	deque.offerFirst("DEF");
	
	deque.addLast("GHK"); // Adds to the TAIL of the deque & throwing an IllegalStateException if no space is currently available. 
	deque.offerLast("YHB"); // true if the element was added to this deque, else false
	deque.offerLast("YHB");
	deque.addLast("GHK");
	
	
	//2. RETRIVE/EXAMINE 
	System.out.println(deque.getFirst()); // Adds to the HEAD of the deque & throwing an IllegalStateException if no space is currently available.
	System.out.println(deque.peekFirst());

	System.out.println(deque.getLast());
	System.out.println(deque.peekLast());
	
	
	//3. REMOVE/DELETE
	System.out.println(deque.removeFirst());
	System.out.println(deque.pollFirst());
	
	System.out.println(deque.removeLast());
	System.out.println(deque.pollLast());
	
	System.out.println(deque);
	
	deque.removeFirstOccurrence("ABC");
	deque.removeLastOccurrence("YHB");
	
	System.out.println(deque);
	
}
}