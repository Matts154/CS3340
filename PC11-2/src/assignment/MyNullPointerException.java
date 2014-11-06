package assignment;

public class MyNullPointerException extends NullPointerException {

	private static final long serialVersionUID = 1L;

	public MyNullPointerException() {
		super("Error! Null pointer!");
	}

	public MyNullPointerException(String message) {
		super(message);
	}
}
