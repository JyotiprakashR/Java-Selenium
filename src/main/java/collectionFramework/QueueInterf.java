package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterf {

	public static void main(String[] a) {
		Queue<String> queue= new PriorityQueue<>();
		
		queue.offer("Tom");
		queue.offer("Hello");
		//queue.add(null);
		//queue.add("");
		queue.offer("Tom");
		queue.offer("ToM");
		queue.offer("Ani");
		queue.offer("Jyoti");
		queue.offer("Naveen");
		
		System.out.println(queue);
		
		queue.offer("Ben"); // Inserts the specified element into this queue 
		
		System.err.println(queue.element()); // Retrieves, but does not remove, the head of this queue.it throws an exceptionif this queue is empty.
		
		System.out.println(queue.peek()); //Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
		
		System.out.println(queue.poll()); //Retrieves and removes the head of this queue,or returns null if this queue is empty.
		
		System.out.println(queue.remove()); //Retrieves and removes the head of this queue, it throws an exception if queue is empty.
		
		System.out.println(queue);
		
		Queue<QueueInterfCustomClass> queCus= new PriorityQueue<>();
		queCus.offer(new QueueInterfCustomClass("Tom", "elly", 25));
		
		queCus.forEach(e->System.out.println(e.toString()));
		
		
		
		
		 
	}

}
