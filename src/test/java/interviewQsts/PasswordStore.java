package interviewQsts;

public class PasswordStore {

	public static void main(String[] args) {

		String pwd = "Welocme@123";
		System.out.println("password-" + pwd);

		char ch[]= new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e', '@', '1', '2', '3'};
		System.out.println("password-" + ch);
		
		String s=new String(ch);
		System.out.println(s);
	}
	

}
