package java_Concepts;

import java.text.DateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Singleton {

	static Singleton instance = new Singleton();

	public static void main(String a[]) {
		// System.out.println("hello");

		// Factory Methods
		DateFormat.getInstance();
		List<Object> l = List.of();
		Set<Object> s = Set.of();
		Map<Object, Object> m = Map.of();
		Map<Object, Object> me = Map.ofEntries();

		String name = "my name is tom";
		String newName = "";
		String nameArr[] = name.split(" ");
		for (String ss : nameArr) {
			newName = newName + (ss.substring(0, 1).toUpperCase()) + ss.substring(1) + " ";
		}
		System.out.println("name : " + name);
		System.out.println("newName : " + newName.trim());

		
		
	}

}
