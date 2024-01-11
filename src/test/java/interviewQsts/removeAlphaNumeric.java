package interviewQsts;

public class removeAlphaNumeric {

	public static void main(String[] args) {
		System.out.println(removeAlphaNumericChar("qwdf@&% ;n;nkn"));

	}
	
	public static String removeAlphaNumericChar(String str) {
		return str.replaceAll("[!a-zA-Z0-9]", "");
	}

}
