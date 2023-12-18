package java8_Concepts;

import java.util.function.Consumer;

@FunctionalInterface
public interface RBI {
	
	
	// 1. Methods return type is void
	//void printBankName(String name); // Abstract method
	
	
	//or below method
	//void pringBankNumber(int num);
	
	//or below method
	//void printCusName(String fName, String lName);
	
	
	// 2. Methods return type is something but not accepting anything
	//String printName();
	
	
	//3. Method is accepting & returning something
	//String toUpperCase(String name);
	
	//4. Mehtod is taking something & returing boolean
//	boolean isBlank(String value);
	
	//4. Mehtod is taking something & returing int
	int length(String value);
	

	
	
}
