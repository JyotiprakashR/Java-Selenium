package interviewQsts;

import org.apache.commons.lang3.StringUtils;

public class CountMatches {

	public static void main(String[] args) {
		System.out.println(countCheck("", "a"));
		System.out.println(countCheck("a", ""));
		System.out.println(countCheck("Hello", "a"));
		System.out.println(countCheck("Hello", "e"));
		System.out.println(countCheck("Hello", "le"));
		System.out.println(countCheck("Hello", null));
		System.out.println(countCheck(null, "Hello"));
		System.out.println("=---------------------------=");
		System.out.println(countCheck(null, 'H'));
		System.out.println(countCheck("Hello", 'H'));
		System.out.println(countCheck("Hello", 'a'));
		
	}
	
	public static int countCheck(String value, String matcher) {
		return StringUtils.countMatches(value, matcher);
	}
	
	public static int countCheck(String value, char matcher) {
		return StringUtils.countMatches(value, matcher);
	}

}
