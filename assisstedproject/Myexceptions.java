package custom_exception;

public class Myexceptions extends Exception {
	String str1;
	Myexceptions(String str2){
		str1=str2;
	}
	public String toString() {
		return("Myexception Occured:"+str1);
		
	}

}
class example1{
	public static void main(String[]args) {
		try {
			System.out.println("Starting of try block");
			//throwing the custom exception using throw
			throw new Myexceptions("This is my error Message");
		}
		catch(Myexceptions exp) {
			System.out.println("Catch Block");
			System.out.println(exp);
		}
	}
}
