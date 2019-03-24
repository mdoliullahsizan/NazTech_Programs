package Validation;

//Java program to check if an email address 
// is valid using Regex. 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class MailValidation {
		public static boolean isValid(String email) 
		{ 
			String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
								"[a-zA-Z0-9_+&*-]+)*@" + 
								"(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
								"A-Z]{2,7}$"; 
								
			Pattern pat = Pattern.compile(emailRegex); 
			if (email == null) 
				return false; 
			return pat.matcher(email).matches(); 
		} 

		/* driver function to check */
		public static MailValid() 
		{ 
			String email = "sizan.org"; 
			if (isValid(email)) 
				System.out.print("Valid"); 
			else
				System.out.print("Not Valid"); 
		} 
	} 
