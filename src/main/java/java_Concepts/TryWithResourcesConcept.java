package java_Concepts;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWithResourcesConcept implements AutoCloseable{
	
	public static void main() throws IOException {

		FileReader fr = new FileReader("");
		try (PrintWriter p = new PrintWriter(""); fr) { // try with resources statement
			// once try block execution is completed, the above resources is gonna close automatically
			// But we should implement AutoClosable interface in our current class
			// This will redure usage of finally block, where we genrally keep our resouce closing stuff

		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}

	}

	@Override
	public void close() throws Exception {
		
		
	}
}