package modifiers_Concepts;

import org.testng.annotations.Test;

public class FinalClassConceptChild { //extends FinalClassConcept--as a final class can't be inherited
	
	@Test
	public void test() {
	FinalClassConcept obj= new FinalClassConcept();
			System.out.println(obj.a);

}
}