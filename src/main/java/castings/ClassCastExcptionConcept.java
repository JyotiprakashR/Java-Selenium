package castings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassCastExcptionConcept {
	
	public static void main(String a[]) {
		
		String s= new String("Hello");
		
		Object o=(Object) s;
		System.out.println(o.toString());
		
		
	}

}
