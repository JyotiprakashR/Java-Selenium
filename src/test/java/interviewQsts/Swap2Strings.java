package interviewQsts;

public class Swap2Strings {

	public static void main(String[] args) {


		String str1="Hello";
		String str2="Welcome";
		
		/*
		 * System.out.println(str2.substring(0)); System.out.println(str2.substring(1));
		 * System.out.println(str2.substring(2)); System.out.println(str2.substring(3));
		 * System.out.println(str2.substring(4)); System.out.println(str2.substring(5));
		 * System.out.println(str2.substring(6)); System.out.println(str2.substring(7));
		 */
		

		str1=str1+str2; // HelloWelcome
		str2=str1.substring(0, str1.length()-str2.length()); // Hello
		str1=str1.substring(str2.length());
		System.out.println("str1-"+str1+" : "+"str2-"+str2);
	}

}
