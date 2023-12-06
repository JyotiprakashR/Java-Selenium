package testNG_Concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryAnnotationConcept {
	
	// The @DataProvider feature can also be used with the @Factory annotation for creating tests at runtime. 
	
	private int param;
	
	@Factory(dataProvider = "dataMethod")
	public FactoryAnnotationConcept(int param) {
		this.param=param;
	}
	
	@DataProvider
	public static Object[][] dataMethod() {
		return new Object[][] { {0}, {1}};
	}
	
	@Test
	public void testMethod1() {
		int opValue=param+1;
		System.out.println("Test method o/p"+opValue);
	}
	
	@Test
	public void testMethod2() {
		int opValue=param+2;
		System.out.println("Test method o/p"+opValue);
	}

}




