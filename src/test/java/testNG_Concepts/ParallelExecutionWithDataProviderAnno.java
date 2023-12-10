package testNG_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelExecutionWithDataProviderAnno {

	/**
	 * Mark a method as supplying data for a test method. The data provider name
	 * defaults to method name. The annotated method must return an Object[][] where
	 * each Object[] can be assigned the parameter list of the test method.
	 * The @Test method that wants to receive data from this DataProvider needs to
	 * use a dataProvider name equals to the name of this annotation.
	 */
	@DataProvider(name = "testData")
	public Object[][] getData() {
		int counter=1;
		System.out.println("Thread ID is--" + Thread.currentThread().getId());
		System.out.println("Number of times being read--"+counter+"");
		counter++;
		Object[][] testData = { { 10 }, { 20 }, { 30 }, { 40 }, {50}, {60}, {70}, {80} };
//		testData[0][0] = 10;
//		testData[0][1] = 20;
//		testData[1][0] = 30;
//		testData[1][1] = 40;

//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.println(testData[i][j]);
//			}
//		}
		return testData;

	}

	@Test(dataProvider = "testData")
	public void ParallelExecutionWithDataProviderAnnoTest(Object num) {
		System.out.println("value is :" + num);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.site/");
		System.out.println(driver.getTitle());
	}

}
