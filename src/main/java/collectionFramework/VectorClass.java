package collectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Spliterator;
import java.util.Vector;

public class VectorClass {

	public static void main(String a[]) {
		Vector<String> vector= new Vector<>();
		
		Vector<String> vector1= new Vector<>(20);
		
		Vector<String> vector2= new Vector<>(20,3);
		
		Vector<String> vector3= new Vector<>(new ArrayList<>());
		
		System.out.println(vector.capacity()); // 10
		
		Enumeration<String> enu=vector.elements();
		
		Spliterator<String> splIte=  vector.spliterator();
	}
}
