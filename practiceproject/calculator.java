package create_arithmatic_calculator;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers: ");
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("enter  operator to perform operation ");
		char op=s.next().charAt(0);
		double ans=0;
		switch(op) {
		case '+':ans=n1+n2;
		         break;
		case '-':ans=n1-n2;
		          break;
		case '*':ans=n1*n2;
		         break;
		case '/':ans=n1/n2;
		          break;
		case  '%':ans=n1%n2;
		          break;
		default:System.out.println("enter a valid operator");          
		          
		}
		System.out.println("The answer is: "+ans);

	}

}
