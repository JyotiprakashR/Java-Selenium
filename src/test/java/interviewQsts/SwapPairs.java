package interviewQsts;

public class SwapPairs {

	public static void main(String[] args) {

		String str = "hEllo";

		char chArr[] = str.toCharArray();

		int i = 0;
		char temp = chArr[i];
		chArr[i] = chArr[i + 1];
		chArr[i + 1] = temp;

		String strNew = new String(chArr);
		System.out.println(strNew);
		
		
		
		String value="jyotiprakash Rout";
		char ch;
		int i1=0;
		for(i1=0; i1<value.length(); i1++) {
			if(Character.isUpperCase(value.charAt(i1))) {
				ch=value.charAt(i1);
				System.out.println(ch);
				break;
			}
		}
		

	}
	
	
	

}
