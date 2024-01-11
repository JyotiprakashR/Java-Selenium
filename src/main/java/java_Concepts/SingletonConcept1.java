package java_Concepts;

public class SingletonConcept1 {

	private static SingletonConcept1 instance= new SingletonConcept1();
	
	private SingletonConcept1() {}
	
	public static SingletonConcept1 getInstace() {
		return instance;
	}
	
	public static void main(String[] args) {
		
		SingletonConcept1 sc= SingletonConcept1.getInstace();
		SingletonConcept1 sc1= SingletonConcept1.getInstace();
		SingletonConcept1 sc2= SingletonConcept1.getInstace();

		
		System.out.println(sc==sc1);
		System.out.println(sc==sc2);
		System.out.println(sc1==sc2);
	}

}
