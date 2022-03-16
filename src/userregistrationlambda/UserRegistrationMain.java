/*
 * UC_3 : As a User need to enter a valid Email ID.
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
		 * 4.Overriding validate method to check firstname of user is valid or not.
		 * 5.Overriding validate method to check lastname of user is valid or not.
		 * 6.Overriding validate method to check Email id of user is valid or not
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
		
		/*
		* @purpose: As a User need to enter a valid Email ID
		* 
		* @param: regex,lastName
		* 
		* @function: To check Email ID is Valid or not
		* 
		* @returns true or false
		*/
		Validation emailid = (regex, email) ->  Pattern.compile(regex).matcher(email).matches();
		System.out.println("Email ID Validation is " +emailid.validate("^[A-z a-z 0-9 + -]+([.]{1}[a-z 0-9]+)*[@][a-z 0-9]{1,5}([.][a-z]{2,3})+([. a-z]{2})?$", "Kumar.bamankar09@gmail.com"));
	
	}
}
