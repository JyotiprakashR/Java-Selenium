package interviewQsts;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

public class ReverseAString {

	@Test
	public static void test() {

		System.out.println(stringUtilsReverse("hello"));
		System.out.println(stringUtilsReverse(""));
		System.out.println(stringUtilsReverse(null));
		System.out.println("---------Approach-2-----------");
		// System.out.println(stringBufferReverse(null)); //...will throw
		// nullPointerException System.out.println(stringBufferReverse(""));
		System.out.println(stringBufferReverse(" "));
		System.out.println("----------Approach-3----------");
		// System.out.println(normalReverse("")); //...will throw
		// java.lang.StringIndexOutOfBoundsException
		System.out.println(normalReverse(" ")); //
		System.out.println(normalReverse(null));// java.lang.NullPointerException:

		System.out.println(normalReverse("Hello"));

		System.out.println("Hello" + 'a');
	}

	// 1. Approach-1 // Using StringUtils
	public static String stringUtilsReverse(String vaue) {
		String reversedValue = StringUtils.reverse(vaue);
		return reversedValue;
	}

	// 2. Approach-2 // Using StringBuffer
	// All the methods are synchronised...where as methods of StringBuilder are
	// non-synchronised
	public static String stringBufferReverse(String vaue) {
		StringBuffer sb = new StringBuffer(vaue).reverse();
		String reversedValue = new String(sb);
		return reversedValue;
	}

	// 3. Approach-3
	public static String normalReverse(String str) {
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
//			char ch=str.charAt(i);
//			char chAr[]= {ch};
//			newStr+= new String(chAr); 

			// or
			/*
			 * char ch=str.charAt(i); String counter=String.valueOf(ch);
			 * newStr=newStr+counter;
			 */

			// or
			newStr += str.charAt(i);
		}
		return newStr;
	}

}
