package testNG_Concepts;

import org.testng.annotations.Test;

public class ParallelAttributeConcept3 {
	
	@Test
	public void testMethod1() {
		System.out.println("Class-ParallelAttributeConcept3 || Method-testMethod1 || Thread-Id=="+Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Class-ParallelAttributeConcept3 || Method-testMethod2 || Thread-Id=="+Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Class-ParallelAttributeConcept3 || Method-testMethod3 || Thread-Id=="+Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod4() {
		System.out.println("Class-ParallelAttributeConcept3 || Method-testMethod4 || Thread-Id=="+Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod5() {
		System.out.println("Class-ParallelAttributeConcept3 || Method-testMethod5 || Thread-Id=="+Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod6() {
		System.out.println("Class-ParallelAttributeConcept3 || Method-testMethod6 || Thread-Id=="+Thread.currentThread().getId());
	}

}
