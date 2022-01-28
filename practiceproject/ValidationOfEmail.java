package validation_of_Email;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidationOfEmail {
	public static boolean isValidEmail(String email) {
		String regex="^(.+)@(.+)$";
		//initialize the pattern object
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		return matcher.matches();
	}
	public static void main(String[]args) {
		List<String>emails=new ArrayList<String>();
		//valid email addresses
		emails.add("Ramarao@example.com");
		emails.add("Ramaraont@example.com");
		emails.add("tarak@example.com.me.org");
		//invalid email address
		emails.add("aish.example.com");
		emails.add("jihad.bob@example.com");
		emails.add("alkaida@.example.com");
		for(String value:emails) {
			System.out.println("The email address "+value+" is "+(isValidEmail(value)?"valid":"invalid"));
			
		}
		System.out.println("enter any email address to check");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println("the email address "+input+" is "+(isValidEmail(input)? "valid":"invalid"));
	}

}
