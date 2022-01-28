package trycatch;

public class MyCatch {
	public static void main(String[]args) {
		int array[]=new int[3];
		try {
			array[7]=3;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds!");
		}
		finally {
			System.out.println("the array is of size"+array.length);
		}
	}

}
