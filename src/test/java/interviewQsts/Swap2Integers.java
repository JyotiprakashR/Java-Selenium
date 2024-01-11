package interviewQsts;

public class Swap2Integers {

	public static void main(String[] args) {
		
		// With-out using third variable
		int a=12;
		int b=13;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a-"+a+" : "+"b-"+b);
		
		
		

	}

}
