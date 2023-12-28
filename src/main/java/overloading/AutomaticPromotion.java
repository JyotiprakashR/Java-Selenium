package overloading;

public class AutomaticPromotion {

	public static void method1(int i) {
		System.out.println("int argument method--" + i);
	}

	public static void method1(float f) {
		System.out.println("float argument method--"+f);
	}
	//------------------------------------------------
	public static void method2(Object o) {
		System.out.println("Object method is being called--"+o);
	}
	
	public static void method2(String o) {
		System.out.println("String method is being called");
	}
	//---------------------------------------------
	public static void method3(String str) {
		System.out.println("String version--"+str);
	}

	public static void method3(StringBuffer str) {
		System.out.println("String version--"+str);
	}
	//--------------------------------------------
	public static void method4(int i) {
		System.out.println("General method4");
	}
	public static void method4(int...is) {
		System.out.println("var-arg method");
	}
	//------------------------------------------
	public static void main(String a[]) {
		AutomaticPromotion ap= new AutomaticPromotion();
		
		method1(10);
		method1(10.5f);
		method1('a');// Automatic promotion// it will show bite value of a i.e. 97
		method1(10l);
	//	intMethod(10.8); // The method intMethod(int) in the type AutomaticPromotion is not applicable for the arguments (double)
		
		method2(new Object());
		method2("Tom"); // if String param is not available Object will be called
		method2(null); // Child method will be called, as relation between Object & String
		
		method3("Tom");
		method3(new StringBuffer("Tom"));
		//method3(null); // The method method3(String) is ambiguous for the type AutomaticPromotion
						// As both has no relation & both can take null value
		
		method4(); // var-arg will be called
		method4(12,23); // var-arg will be czlled
		method4(10); // general method called
	}

}
