package interviewQsts;

public class RandomQst2Copy {
	public static void main(String[] args) {
		String input = "ern145young4LLP7";
		String revInput = new StringBuffer(input.replaceAll("[^a-zA-Z]", "")).reverse().toString();

		int strtInd = 0;
		String numStr = "";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				strtInd = i;
				while (strtInd < input.length() && Character.isDigit(input.charAt(i))) {
					numStr = numStr + input.charAt(i);
					i++;
					if (i == input.length()) {
						break;
					}
				}
				revInput = revInput.substring(0, strtInd) + numStr + revInput.substring(strtInd);
				numStr = "";
			}
		}
		System.out.println("Output-" + revInput);
	}
}
