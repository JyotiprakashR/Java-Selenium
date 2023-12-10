package testNG_Concepts;

import org.testng.annotations.Test;

public class Dataproviderthreadcount_Parallel_Threadcount_Concept5 {
	
	@Test(dataProvider = "testData", dataProviderClass = ParallelExecutionWithDataProviderAnno.class)
	public void testMethod1(Object num) {
		System.out.println("value is :" + num);
		System.out.println("Class-Dataproviderthreadcount_Parallel_Threadcount_Concept1 || Method-testMethod1 || Thread-Id=="+Thread.currentThread().getId());
	}
	
	@Test(dataProvider = "testData", dataProviderClass = ParallelExecutionWithDataProviderAnno.class)
	public void testMethod2(Object num) {
		System.out.println("value is :" + num);
		System.out.println("Class-Dataproviderthreadcount_Parallel_Threadcount_Concept1 || Method-testMethod2 || Thread-Id=="+Thread.currentThread().getId());
	}
	
	@Test(dataProvider = "testData", dataProviderClass = ParallelExecutionWithDataProviderAnno.class)
	public void testMethod3(Object num) {
		System.out.println("value is :" + num);
		System.out.println("Class-Dataproviderthreadcount_Parallel_Threadcount_Concept1 || Method-testMethod3 || Thread-Id=="+Thread.currentThread().getId());
	}
	
	@Test(dataProvider = "testData", dataProviderClass = ParallelExecutionWithDataProviderAnno.class)
	public void testMethod4(Object num) {
		System.out.println("value is :" + num);
		System.out.println("Class-Dataproviderthreadcount_Parallel_Threadcount_Concept1 || Method-testMethod4 || Thread-Id=="+Thread.currentThread().getId());
	}
	
}
