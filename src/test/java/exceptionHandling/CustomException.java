package exceptionHandling;

public class CustomException extends RuntimeException{
	
	CustomException(String msg){
		super(msg);
	}
	
	public void CustomExceptionCatchMethod(CustomException e) {
		System.out.println("catch block");
	}

}
