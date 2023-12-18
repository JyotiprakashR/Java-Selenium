package java8_Concepts;

@FunctionalInterface
interface IPrintable {

	void print(); // abstract method
	
	//public void newMehtod();--if we are writing this, it's not a functional interface

	default void isPrintable() {

	}
	
	default void printableToConsole(String value) {

	}

	static String isPrintable(String value) {
		return value;
	}

}
