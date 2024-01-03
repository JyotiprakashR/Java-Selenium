package interviewQsts;

import org.testng.annotations.Test;

public class ReverseAString {
	
	@Test
	public static void test() {
		String s="Hello";
		
		StringBuffer bf=new StringBuffer(s);
		System.out.println(bf.reverse());
		
		
	}

}
