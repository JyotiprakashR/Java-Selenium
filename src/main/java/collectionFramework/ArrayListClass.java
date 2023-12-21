package collectionFramework;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Vector;

import edu.emory.mathcs.backport.java.util.Collections;

public class ArrayListClass {
	
	
	public static synchronized void tets() {
		Thread t= new Thread();
		long id=t.getId();
		System.out.println("test method--"+id);
	}

	public static  void main(String a[]) {
		int i=0;
		ArrayList<Object> arr= new ArrayList<>();
		arr.ensureCapacity(2);
		while(i<12) {
			arr.add(i);
			i++;
		}
		for(int i1=arr.size()-1; 0<=i1; i1--) {
			System.out.println(arr.get(i1));
		}
		Object arr1= arr.clone(); // Returns a shallow copy of this ArrayList instance. (Theelements themselves are not copied.)
		System.out.println(arr1.toString());
		
		arr.trimToSize();
		List<Object> list=Collections.synchronizedList(arr);
		//Queue<E>
		System.out.println(arr.size());
	}

}
