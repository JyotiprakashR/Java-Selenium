package interviewQsts;

public class RandomQst {

	public static void main(String[] args) {
		String input = "ernst1young4LLP7";
		String output = "PLLgn1uoyts4nre7";

		String reverseInput = new StringBuffer(input.replaceAll("[^a-zA-Z]", "")).reverse().toString();

		int startIndex, endIndex = 0;
		String numString = "";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				startIndex = i;
				endIndex = startIndex;
				int j = i;
				while (startIndex < input.length() && Character.isDigit(input.charAt(j))) {
					numString = numString + input.charAt(j);
					endIndex++;
					j++;
					i = j - 1;
					if (j == input.length()) {
						break;
					}
				}
				reverseInput = insertString(reverseInput, numString, startIndex);
				numString = "";
			}
		}
		System.out.println("Output-" + reverseInput);
	}
	
	public static String insertString(String oStr, String nStr, int index) {
		return oStr.substring(0, index) + nStr + oStr.substring(index);
	}
}
