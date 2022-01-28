package custom_exception;

public class ThrowDemo {

		public static void main(String[]args) {
			int a=45,b=0,rs;
			try {
				if(b==0)
				throw(new ArithmeticException("can't divided by zero."));
				else {
					rs=a/b;
					System.out.println("\n \t the result is:"+rs);
				}
			}
			catch(ArithmeticException Ex) {
				System.out.println("\n \t Error:"+Ex.getMessage());
				
			}
			System.out.println("\n \t End of program.");
		}
	}


