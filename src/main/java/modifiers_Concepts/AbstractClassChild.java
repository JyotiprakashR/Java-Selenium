package modifiers_Concepts;

import org.testng.annotations.Test;

public class AbstractClassChild extends AbstractClass{
	
	// AbstractClass abs= new AbstractClass(); // Cannot instantiate the type AbstractClass
	
	@Test
	public void tets() {
		System.out.println(AbstractClass.a);	
	}

	@Override
	void test1() {
		// TODO Auto-generated method stub
		
	}

}
