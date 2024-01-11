package java_Concepts;

public class FinalizeConcept {
	
	public static void main(String ar[]) {
		FinalizeConcept obj= new FinalizeConcept();
		obj=null;
		
		System.gc();
		
	}
	
	@Override
	public void finalize() {
		System.out.println("finalize method is overridden");
	}

}
