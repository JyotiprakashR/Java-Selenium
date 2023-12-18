package pack2;

import pack1.Car;

public class Car2 extends Car{

	public static void main(String a[]) {
		Car car= new Car();
		// car.m1(); // As m1() is protected unless it's child of Car
		
		Car2 carr= new Car2();
		carr.m1();
	}
}
