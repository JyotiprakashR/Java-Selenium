package java_Concepts;

public class SingletonConcept {

	private static SingletonConcept instance = null;
	private String name="hello";

	private SingletonConcept() {}

	public static SingletonConcept getInstance() {
		if (instance == null) 
			instance = new SingletonConcept();		
		return instance;
	}

	public static void main(String[] args) {
		
		SingletonConcept sc= SingletonConcept.getInstance();
		SingletonConcept sc1= SingletonConcept.getInstance();
		SingletonConcept sc2= SingletonConcept.getInstance();
		
		System.out.println(sc==sc1);
		System.out.println(sc==sc2);
		System.out.println(sc1==sc2);
		
		sc.name= sc.name.toUpperCase();
		System.out.println(sc.name);
		System.out.println(sc1.name);
		System.out.println(sc2.name);
		
		//Runtime class in java example of Singleton pattern
		
	}

}
