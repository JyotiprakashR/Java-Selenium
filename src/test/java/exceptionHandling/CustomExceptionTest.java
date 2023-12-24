package exceptionHandling;

public class CustomExceptionTest {

	static ArithmeticException ae;

	public static void main(String a[]) throws CustomException {

		// throw ae;
		try {
			throw new CustomException("custom exception message");
		} catch (CustomException e) {
			e.printStackTrace();
		}

		// tet();
	
		
		//throw new CustomException();
	}

	public static void tet() {
		throw new Error();
	}

}
