package interviewQsts;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.checkerframework.checker.units.qual.C;

public class FindDuplicateChars {

	public static void main(String[] args) {
		printDuplicateChars(null);
		printDuplicateChars("");
		printDuplicateChars(" ");
		printDuplicateChars("\t");
		printDuplicateChars("Java");
		printDuplicateChars("Hello");

	}

	public static void printDuplicateChars(String str) {

		if (str == null) {
			System.out.println("NULL string");
		} else if (str.isEmpty()) {
			System.out.println("EMPTY string");
		} else if (str.isBlank()) {
			System.out.println("BLANK string");
		} else {
			char[] ch = str.toCharArray();
			Map<Character, Integer> linkedMap = new LinkedHashMap<>();
			for (int i = 0; i < ch.length; i++) {
				if (linkedMap.containsKey(ch[i])) {
					linkedMap.put(ch[i], linkedMap.get(ch[i]) + 1);
				} else {
					linkedMap.put(ch[i], 1);
				}
			}
			// System.out.println(linkedMap);
			for (Entry<Character, Integer> entrySet : linkedMap.entrySet()) {
				if (entrySet.getValue() > 1) {
					System.out.println(entrySet);
				}
			}
			/*
			 * Set<Map.Entry<Character, Integer>> entryySet = linkedMap.entrySet(); for
			 * (Map.Entry<Character, Integer> entry : entryySet) { if (entry.getValue() > 1)
			 * { System.out.println(entry); } }
			 */
		}
	}

}
