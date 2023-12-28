package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DefaultExceptionHandlingByJVM {
	
	static{ // static block
		System.out.println("Static block");
	}
	{ // instance block
		System.out.println("Instance initializer block");
	}
	public static void main(String a[]) {
		//DefaultExceptionHandlingByJVM obj= new DefaultExceptionHandlingByJVM();
//		System.out.println(test());
		test(20);
		
	}

	public static int test() {
		System.exit(-1);
		try {
			return 777;
		}
		catch(Exception e){
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			return 888;
		}
		finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			return 999;
		}
		
		
	}
	
	public static void test(int n) {
	    if (n == 1) {
	        return; 
	    }
	    else if (n == 2) {
	        return;
	    }
	    test();
	}
	
//	public static void main(String a[]) {
//		//doStuff();
//		
//		
//		try {
//			FileInputStream file= new FileInputStream("");
//			System.out.println(10/0);
//			System.out.println("Completed");
//		} 
//			catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} 
//		catch (NullPointerException e) {
////			e.printStackTrace(); // it wil print all the info regarding exception i.e. exception name & description & stack trace
//			//System.out.println(e); // below is the same // it will just print the description
//			System.out.println(e.toString()); // it will just print the description
//			//System.out.println(e.getMessage()); // it will just print the exception name
//		}
//	}

	private static void doStuff() {
		doMoreStuff();
		System.out.println(10/0);
	}

	private static void doMoreStuff() {

		System.out.println("completed execution");
		
	}

}

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at exceptionHandling.DefaultExceptionHandlingByJVM.doMoreStuff(DefaultExceptionHandlingByJVM.java:14)
//at exceptionHandling.DefaultExceptionHandlingByJVM.doStuff(DefaultExceptionHandlingByJVM.java:10)
//at exceptionHandling.DefaultExceptionHandlingByJVM.main(DefaultExceptionHandlingByJVM.java:6)

//completed execution
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at exceptionHandling.DefaultExceptionHandlingByJVM.doStuff(DefaultExceptionHandlingByJVM.java:11)
//	at exceptionHandling.DefaultExceptionHandlingByJVM.main(DefaultExceptionHandlingByJVM.java:6)
//

