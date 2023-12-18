package java8_Concepts;



public class CarTest {

	public static void main(String[] arg) {
		
		Car car1 = new Car() {
			@Override
			public void enginee() {
				System.out.println("Anonymous inner class");
			}
		};
		Car car2 = new Car() {
			@Override
			public void enginee() {
				System.out.println("Anonymous inner class test");
			}
		};
		
		car1.enginee();
		car2.enginee();
	}

	
	
}
