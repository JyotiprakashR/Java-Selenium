package modifiers_Concepts;

import org.testng.annotations.Test;

public class PublicVariablesChild extends PublicVariables{

	
	@Test
	public void test() {
	PublicVariables p= new PublicVariables();
	System.out.println(p.a);
	//p.k // can't access as variable is set to private, so it's only accessible to same class only
	p.l=24; // can be accessable, as variable is declared as protected...it's accessable to class & same package
	p.a=20;
	System.out.println(PublicVariables.b);
	PublicVariables.b=30;
	
	

}
}