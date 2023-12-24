package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHierarchy {

	// Exception Hiranrchy
	
	// Throwable class is the parent of all the Exceptions & Errors
	// Throwable is having 2 classess--1. Exception & 2. Error
	// Errors caused by lack of Sysytem resources
	// Eception is caused by developer only
	//

	
	// Checked Vs UnChecked Exception
	
	// Exceptions which are check by Compiler for smooth execution of the program, is called Checked Exception
	// 
	
	// PrintWriter pw= new PrintWriter("");
	// Default constructor cannot handle exception type FileNotFoundException thrown by implicit super constructor. 
	// Must define an explicit constructor
	
	public static void main(String s[])  {
		// Compile time Error---Unhandled exception type FileNotFoundException
		//PrintWriter pw= new PrintWriter("");
		try {
			FileInputStream fil= new FileInputStream("");
			Thread.sleep(2000);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		catch (FileNotFoundException | InterruptedException e) {
//			e.printStackTrace();
//		} 
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
