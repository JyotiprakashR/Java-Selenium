package interviewQsts;

import org.apache.commons.lang3.StringUtils;

public class VerifyNumberInAString {

	public static void main(String[] args) {


		System.out.println(isNumberPresent("abc"));
		System.out.println(isNumberPresent("abc1"));
		System.out.println(isNumberPresent("a"));
		System.out.println(isNumberPresent(null));
		System.out.println(isNumberPresent(""));
		System.out.println(isNumberPresent(" "));
		System.out.println(isNumberPresent("125"));

	}
	
	public static boolean isNumberPresent(String str) {
		if(str==null || str.length()==0) {
			return false;
		}
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

}
