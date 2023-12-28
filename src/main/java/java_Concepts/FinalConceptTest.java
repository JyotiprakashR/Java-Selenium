package java_Concepts;

import java.util.ArrayList;

public class FinalConceptTest {// extends FinalConcept

	
	// final classes can't be inherited
	// but can be instanciated
	
	public static void main(String a[]) {
		FinalConceptTest f= new FinalConceptTest();
		
		f=null;
		
		System.gc();
	}
	
	public  void finalize () {
		System.out.println("finalize method");
	}

}
