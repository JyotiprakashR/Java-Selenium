package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ListInterf {

	// List is an interface
	// Collection<E> > Iterable<T>

	public static void main(String a[]) {
	List<String> list= new ArrayList<>();
	
	list.add("Tom");
	list.add("Helo");
	list.add("Tom");
	list.add(null);
	list.add(null);
	
	System.out.println("-------------------------------1");
	System.out.println(list);
	System.out.println("-------------------------------2");
	list.forEach(System.out::println );
	System.out.println("-------------------------------3");
	for(int a1=0;a1<list.size(); a1++) {
		System.out.println(list.get(a1));
	}
	System.out.println("-------------------------------4");
	for(String s: list) {
		System.out.println(s);
	}
	System.out.println("-------------------------------5");
	String[] s=new String[10];
	list.toArray(s); // What ever we are providing it will return the same
	for(String ss: s) {
		System.out.println(ss);
	}
	
	System.out.println("-------------------------------6");
	Object[] so=list.toArray(); // will return object[]
//	for(Object ss: so) {
//		System.out.println(ss.toString());
//	}
	System.out.println("-------------------------------7");
	list.add(4, "Lily");
	list.forEach(System.out::println );
	System.out.println("-------------------------------8");
	Queue<String> queue= new PriorityQueue<>();
	queue.add("Ben");
	
	list.addAll(queue);
	list.forEach(System.out::println );
	
	System.out.println("-------------------------------9");
	System.out.println(list.contains(""));
	System.out.println("-------------------------------10");
	System.out.println(list.containsAll(queue));
	System.out.println("-------------------------------11");
	System.out.println(list.indexOf("Tom"));
	System.out.println(list.indexOf(""));
	System.out.println(list.indexOf(null));
	System.out.println("-------------------------------12");
	Iterator<String>itr=list.iterator();
	if(itr.hasNext()) {
		itr.forEachRemaining(e->System.out.println(e));
	}
	System.out.println("-------------------------------13");
	 /**
     * Returns an iterator over the elements in this list in proper sequence.
     * @return an iterator over the elements in this list in proper sequence
     **/
	Iterator<String>ir1=list.iterator();
	while(ir1.hasNext()) {
		System.out.println(ir1.next());
	}
	System.out.println("-------------------------------14");
	System.out.println(list.lastIndexOf("Tom"));
	System.out.println(list.lastIndexOf(null));
	System.out.println(list.lastIndexOf(""));
	//Returns the index of the last occurrence of the specified elementin this list, 
	//or -1 if this list does not contain the element.
	//More formally, returns the highest index i such that Objects.equals(o, get(i)),
	//or -1 if there is no such index.
	
	System.out.println("-------------------------------14");
	/** 
	 * Returns a list iterator over the elements in this list (in proper sequence).
	 * @return a list iterator over the elements in this list (in proper sequence)
	 **/
	ListIterator<String> listItr =list.listIterator();
	listItr.next();
	listItr.remove();
	System.out.println(list);
	System.out.println("-------------------------------15");
	// list.retainAll(queue); // Removes all the other elements except the provided Collecion
	System.out.println(list);
	System.out.println("-------------------------------16");
	//list.removeAll(queue);
	System.out.println(list); // Removes the specified collection from the whole collection
	System.out.println("-------------------------------16");
	list.forEach(System.out::println);
	//list.remove(null); // will remove the first occurance of null
    //list.removeIf( e->e==null); // will remove all the occurances of null
	System.out.println(list); 
	System.out.println("-------------------------------17");
	//list.removeIf(e->e.startsWith("T"));
	System.out.println(list);
	System.out.println("-------------------------------18");
	// Collections.sort(list); have to remove null object before sorting
	System.out.println(list);
	System.out.println("-------------------------------18");
	Spliterator<String> splItr= list.spliterator();
	System.out.println(splItr.estimateSize());
	//splItr.forEachRemaining(e->System.out.println(e));
	list=list
		.stream()
		.filter(z->!(z==null)) 
		.sorted()
		.collect(Collectors.toList());
	System.out.println(list);
	System.out.println("-------------------------------19");
	list.replaceAll(e->e.concat("H"));
	System.out.println(list);
	
	String string="Hello";
	String[] sA=new String[]{string};
	System.out.println("-------------------------------19");
	List<ListInterfCustomClass> listObj= new ArrayList<>();
	listObj.add(new ListInterfCustomClass());
	listObj.add(new ListInterfCustomClass("Tom", "Lily", 20));
	System.out.println(listObj.get(1).toString());
	System.out.println("-------------------------------20");
	System.out.println(list);
	List<String> list1=list.subList(1, 4);
	System.out.println(list1);
	
	System.out.println(list.indexOf("Tom"));
	
	list.set(0, "LailaH");
	
	System.out.println(list);
	
	
	
}
}