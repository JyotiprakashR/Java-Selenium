package interviewQsts;

public class InsertAStringWithinAString {

	public static void main(String[] args) {

		String name = "Hello";

		// Using StringBuffer
		StringBuffer sb = new StringBuffer(name);
		sb = sb.insert(name.length(), " Welcome");
		System.out.println(sb);
		sb = sb.insert(name.length(), ' ').insert(name.length() + 1, 't').insert(name.length() + 2, 'o');
		System.out.println(sb);

		// Using String substring()
		System.out.println(insertString("Welcomesubstring", "To", 7));
		System.out.println(insertChar("Welcomesubstring", 7, 'T','o'));

		System.out.println(Character.isTitleCase('c'));
		System.out.println(Character.toTitleCase('c'));
	}

	public static String insertString(String mainStr, String newStr, int postion) {
		return mainStr.substring(0, postion) + newStr + mainStr.substring(postion);
	}
	
	public static String insertChar(String mainStr, int postion, char...ch) {
		return mainStr.substring(0, postion) + new String(ch) + mainStr.substring(postion);
		
	}
	
	

}
