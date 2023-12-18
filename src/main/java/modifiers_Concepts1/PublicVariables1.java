package modifiers_Concepts1;

import modifiers_Concepts.PublicVariables;

public class PublicVariables1 extends PublicVariables{
	
	public static void main(String[]a) {
		System.out.println(PublicVariables.b=23);
		PublicVariables obj= new PublicVariables();
		System.out.println(obj.a);
		//obj.k //--- won't be accessible, as var is set to private
		
		PublicVariables1 obj1= new PublicVariables1();
		System.out.println(obj1.l=52);
		
	}

}
