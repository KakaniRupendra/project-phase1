package custom_exception;

public class MyException extends Exception {
	public MyException(String s) {
		super(s);
		
	}

}
 class Main{
	public static void main(String[]args) {
		try {
			throw new MyException("temp");
		}
		catch(MyException ex) {
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
	}
}