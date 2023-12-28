package java_Concepts;

public class StackOverFlowError {
	
	public static void method1() {
		method2();
	}

	private static void method2() {
		method1();
	}
	
	public static void main(String a[]) {
		method2();
		
	}

}

//Exception in thread "main" java.lang.StackOverflowError
//at java_Concepts.StackOverFlowError.method1(StackOverFlowError.java:6)
//at java_Concepts.StackOverFlowError.method2(StackOverFlowError.java:10)
//at java_Concepts.StackOverFlowError.method1(StackOverFlowError.java:6)
