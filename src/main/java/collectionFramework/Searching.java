package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Searching {

	public static void main(String a[]) {

		// LIST
		System.out.println("----------------LIST----------------------");
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Hello");
		arr.add("Ben");
		arr.add("Ajio");
		arr.add("Joe");

		// DNSO
		Comparator<Object> comp = (o1, o2) -> o1.toString().compareTo(o2.toString());
		arr.sort(comp);
		// OR
		// Collections.sort(arr);
		System.out.println("DNSO--" + arr);

		// SEARCHING with DNSO
		// if List is sorted according to DNSO binarySearch takes two arguments, 1. List // 2. Object target
		System.out.println(Collections.binarySearch(arr, "Ben")); // If target is preset--returns index of the targer from the sorted list
		System.out.println(Collections.binarySearch(arr, "Chirag")); // If target is not present--retuns Insertion Point---i.e where the target can be addedd/place in the sorted list.
		int value=Collections.binarySearch(arr, "Ajio");
		if(value>=0) {
			System.out.println("Search sucessfull--Found the element");
		}else {
			System.out.println("Unsucessfull search--couldn't found element");
		}
		
		// CSO
		Comparator<String> compara = (c, b) -> -c.compareTo(b);
		Collections.sort(arr, compara);
		System.out.println("CSO--" + arr);

		// SEARCHING with CSO
		// if List is sorted according to CSO binarySearch takes three argument, 1. List 2. Object target, Comparator Object
		System.out.println(Collections.binarySearch(arr, "Ben", compara)); // If target is preset--returns index of the targer from the sorted list
		System.out.println(Collections.binarySearch(arr, "Chirag")); // If target is not present--retuns Insertion Point---i.e where the target can be addedd/place in the sorted list.
		int value1=Collections.binarySearch(arr, "A");
		if(value1>=0) {
			System.out.println("Search sucessfull--Found the element");
		}else {
			System.out.println("Unsucessfull search--couldn't found element");
		}
		
		
		// SET
		System.out.println("----------------SET----------------------");
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Ben");
		set.add("Ajio");
		set.add("Joe");
		set.add("Joe");
		set.add("Majnu");
		set.add("Lily");
		System.out.println("Set--"+set);
		//set.forEach(e->System.out.println(e));
		ArrayList<String> arrayList= new ArrayList<>(set);
		System.out.println("List---"+arrayList);
		Collections.sort(arrayList);
		System.out.println("Sorted List--"+arrayList);
		System.out.println(Collections.binarySearch(arrayList, "Ajio"));
		
		// Reverse of collection
		ArrayList<String> arrayList1= new ArrayList<>(set);
		Collections.reverse(arrayList1);
		System.out.println("Reversed List---"+arrayList1);
		
		Comparator<String> revComp=Collections.reverseOrder();
		Collections.sort(arrayList1, revComp);
		System.out.println("reverseOrderList---"+arrayList1);
		

	}

}
