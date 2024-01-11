package interviewQsts;

import java.util.Arrays;
import java.util.Comparator;

public class Searching {

	public static void main(String[] args) {
		String name[] = { "Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "Azure", "GCP" };

		Arrays.sort(name);

		int i = Arrays.binarySearch(name, "GP");
		if (i > 0) {
			System.out.println("Present");
		} else {
			System.out.println("Not present");
		}
		
		Arrays.sort(name, (a,b)-> -a.compareTo(b));
		
		Arrays.stream(name).distinct().forEach(e->System.out.println(e));
		
		
		Comparator<String> compa= new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		Arrays.sort(name, compa);
		
		System.out.println(Arrays.stream(name).count());
	
	}
}
