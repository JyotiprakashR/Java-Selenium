package interviewQsts;

public class RemoveSplChars {

	public static void main(String[] args) {
		System.out.println(remove("hello % welcome #"));

	}
	
	public static String remove(String str) {
		return str.replaceAll("[^a-zA-z0-9]", "");
	}

}
