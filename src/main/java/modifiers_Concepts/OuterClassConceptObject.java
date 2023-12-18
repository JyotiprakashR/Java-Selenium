package modifiers_Concepts;

import org.testng.annotations.Test;

import modifiers_Concepts.OuterClassConcept.Innerclass;

public class OuterClassConceptObject {

	@Test
	public void est() {
		OuterClassConcept obj = new OuterClassConcept();// outer cass object

		Innerclass obj1 = obj.new Innerclass();
	}

}
