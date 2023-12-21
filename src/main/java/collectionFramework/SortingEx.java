package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingEx { // SortingExample

	public static void main(String a[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(30);
		al.add(20);
		al.add(10);
		al.add(40);
		al.add(50);
		
		System.out.println(al);//[30, 20, 10, 40, 50]
				
		// SORT
		Collections.sort(al);
		System.out.println(al); // [10, 20, 30, 40, 50]--DNSO
		Object b=al.clone();
		ArrayList<Integer> alr = (ArrayList<Integer>)b;
		System.out.println(alr); // [10, 20, 30, 40, 50]--cloned it
		Collections.sort(alr, Collections.reverseOrder());
		System.out.println(alr); // [50, 40, 30, 20, 10]--CSO
		
		
		Comparator<String> compp= Collections.reverseOrder(Collections.reverseOrder());
		
		
	}

}
