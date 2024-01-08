package interviewQsts;

public class ReplaceString {

	public static void main(String[] args) {
		
		
		String input="Hello, World.";
		String output="Hello, Java.";
		
		String strArr[]=input.split(" ");
		strArr[1]="Java.";
		String s="";
		for(int i=0; i<strArr.length; i++) {
			s=s.concat(strArr[i])+" ";
		}
		System.out.println(input);
		System.out.println(s.trim());
		
		

	}

}
