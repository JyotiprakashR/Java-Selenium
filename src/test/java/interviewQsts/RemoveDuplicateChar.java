package interviewQsts;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import edu.emory.mathcs.backport.java.util.Arrays;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String str = "Hello";
		String str1 = "";

		// 1. Approach-1 || Basic method
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					char ch = str.charAt(i);
					str1 = str1 + ch;
					String newStr = str.replaceFirst(str1, "");
					System.out.println(newStr);
				}

			}
		}

		// 2. Approach-2 || Using Arrays
		char ch[] = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		for (Character c : ch) {
			set.add(c);
		}
		System.out.println(set);
		StringBuffer sb = new StringBuffer();
		for (char cc : set) {
			sb.append(cc);
		}
		System.out.println(sb.toString());

		// Using Streams

		@SuppressWarnings("unchecked")
		Object newStrr = Arrays.asList(str.split(""))
								.stream()
								.distinct()
								.collect(Collectors.joining());
		System.out.println(newStrr.toString());
		
		
		
	}

}
