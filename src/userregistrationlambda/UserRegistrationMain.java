/*
 * UC_2 : As a User need to enter a valid Last Name. last name starts with cap and has minimum 3 charcters.
 * @author - Kumar Bamankar
 */
package userregistrationlambda;

import java.util.regex.Pattern;

public class UserRegistrationMain {

	public static void main(String[] args) {
		System.out.println("______________________________");
		System.out.println("USER REGISTRATION");
		System.out.println("______________________________");
		
		/*PROCEDURE :
		 * 1.Creating a Interface named as Validation
		 * 2.In that creating a abstract method named as validate.
		 * 3.Using validate method directly in main class with the help of lambda expression.
		 * 4.Overriding validate method to check firstname of user is validate or not.
		 * 5.Overriding validate method to check lastname of user is validate or not.
		 */
		
	   /*
		* @purpose: As a User need to enter a valid First Name. First name starts with
		* Cap and has minimum 3 characters
		* 
		* @param: regex,firstName
		* 
		* @function: To check first name is Valid or not
		* 
		* @returns true or false
		*/
		Validation firstname = (regex, firstName) ->  Pattern.compile(regex).matcher(firstName).matches();
		System.out.println("First Name Validation is " +firstname.validate("^[A-Z]{1}[a-z]{2,}$", "Kumar"));
		
		/*
		* @purpose: As a User need to enter a valid Last Name. Last name starts with
		* Cap and has minimum 3 characters
		* 
		* @param: regex,lastName
		* 
		* @function: To check first name is Valid or not
		* 
		* @returns true or false
		*/
		Validation lastname = (regex, lastName) ->  Pattern.compile(regex).matcher(lastName).matches();
		System.out.println("Last Name Validation is " +lastname.validate("^[A-Z]{1}[a-z]{2,}$", "Bamankar"));
	
	}
}
