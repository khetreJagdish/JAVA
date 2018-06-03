package setinterface;

public class CustomException extends Exception {
		
	private int id;
	public CustomException() {

	}
	

public CustomException(String message ,int id, Throwable throwable) {
		super(message);
		this.id = id;
	}
	public CustomException(String message , Throwable throwable) {
		super(message, throwable);
	}
	

}
