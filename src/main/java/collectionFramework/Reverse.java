package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Reverse {
	public static void main(String a[]) {

		ArrayList<String> arr = new ArrayList<>();
		arr.add("Hello");
		arr.add("Ben");
		arr.add("Ajio");
		arr.add("Joe");
		
		System.out.println("list--"+arr); // list--[Hello, Ben, Ajio, Joe]
		Collections.reverse(arr);
		System.out.println("Reversed list--"+arr); // Reversed list--[Joe, Ajio, Ben, Hello]
		
		
		
		
		Comparator<String> comp= Collections.reverseOrder(); // Ascending order Comparator
		
		Comparator<String>revComp= Collections.reverseOrder(comp); // Descending order comparator
		
		Collections.sort(arr, comp);
		System.out.println("Using Ascending order Comparato---r"+arr); // Using Ascending order Comparato---r[Joe, Hello, Ben, Ajio]
		
		Collections.sort(arr, revComp);
		System.out.println("Using Descending order Comparator---"+arr); // Using Descending order Comparator---[Ajio, Ben, Hello, Joe]

		
		
				
				
				
	}
}
