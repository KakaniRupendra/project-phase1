package custom_exception;

public class FinallyBlockDemo {
	public static void main(String[]args) {
		int a=45,b=0,rs=0;
		try {
			rs=a/b;
		}
		catch(ArithmeticException Ex) {
			System.out.println("\n \t Error:"+Ex.getMessage());
		}
		finally {
			System.out.println("\n \t the result is:"+rs);
		}
	}

}
