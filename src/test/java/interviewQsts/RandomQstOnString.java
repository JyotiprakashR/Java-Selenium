package interviewQsts;

public class RandomQstOnString {

	public static void main(String[] args) {

		String input = "0test0pop0java0pyt";
		String output = "0tset0pop0avaj0typ";

		StringBuffer sb= new StringBuffer();
		for (int i = 0; i < input.length();) {
			if (Character.isLetter(input.charAt(i))) {
				int start = i;
				while (i < input.length() && Character.isLetter(input.charAt(i))) {
					i++;
				}
				//input = new StringBuffer(input.substring(start, i)).reverse().toString()+input.substring(i);
				String subString = input.substring(start, i);
				String reverseSubString = new StringBuffer(subString).reverse().toString();
				sb.append(reverseSubString);
			}else if (Character.isDigit(input.charAt(i))) {
				int start = i;
				while (i < input.length()& Character.isDigit(input.charAt(i))) {
					i++;
				}
				String subString = input.substring(start, i);
				sb.append(subString);

			}
			else {
				sb.append(input.charAt(i));
				i++;
			}	
		}
		System.out.println(sb.toString());

	}

}
