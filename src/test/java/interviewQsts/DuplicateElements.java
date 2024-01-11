package interviewQsts;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateElements {

	public static void main(String[] args) {

		String name[] = { "Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "Azure", "GCP" };

		// Using HashSet
		System.out.println("-----Using HashSet------------");
		HashSet<String> hashset = new HashSet<>();
		for (int i = 0; i < name.length; i++) {
			if (hashset.add(name[i]) == false) {
				System.out.println(name[i]);
			}
		}

		// Using HashMap
		System.out.println("-----Using HashMap's containsKey()------------");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String str : name) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else
				map.put(str, 1);
		}
		for (Entry<String, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() > 1) {
				System.out.println(entrySet.getKey());
			}
		}

		// Using HashMap
		System.out.println("-----Using HashMap's get()------------");
		Map<String, Integer> map1 = new LinkedHashMap<>();
		for (String str : name) {
			Integer counter = map1.get(str);
			if (counter == null) {
				map1.put(str, 1);
			} else {
				map1.put(str, ++counter);
			}
		}
		for (Entry<String, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() > 1) {
				System.out.println(entrySet.getKey());
			}
		}

	}

}
