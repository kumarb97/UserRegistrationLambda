/*
 * UC_8_rule-04 : As a User need to enter a valid Password.
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
		 * 7.Overriding validate method to check Phone number of user is valid or not
		 * 8.Overriding validate method to check Password of user is valid or not
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
		* @param: regex,email
		* 
		* @function: To check Email ID is Valid or not
		* 
		* @returns true or false
		*/
		Validation emailid = (regex, email) ->  Pattern.compile(regex).matcher(email).matches();
		System.out.println("Email ID Validation is " +emailid.validate("^[A-z a-z 0-9 + -]+([.]{1}[a-z 0-9]+)*[@][a-z 0-9]{1,5}([.][a-z]{2,3})+([. a-z]{2})?$", "Kumar.bamankar09@gmail.com"));
		
		/*
		* @purpose: As a User need to enter a valid Phone number
		* 
		* @param: regex,mobNumber
		* 
		* @function: To check Phone number is Valid or not
		* 
		* @returns true or false
		*/
		Validation phnnumber = (regex, mobNumber) ->  Pattern.compile(regex).matcher(mobNumber).matches();
		System.out.println("Phone Number Validation is " +phnnumber.validate("^[0-9]{2}[ ]?[0-9]{10}$", "91 9876543210"));
		
		/*
		* @purpose: As a User need to enter a valid Password having minimum 8 characters
		* 
		* @param: regex,password
		* 
		* @function: To check Password is Valid or not
		* 
		* @returns true or false
		*/
		Validation password1 = (regex, password) ->  Pattern.compile(regex).matcher(password).matches();
		System.out.println("Password Validation is " +password1.validate("^[A-Za-z0-9]{8,}$", "Asdffggghhgg"));
		
		/*
		* @purpose: As a User need to enter a valid Password having minimum 8 characters and atleast have one upper case.
		* 
		* @param: regex,password
		* 
		* @function: To check Password is Valid or not
		* 
		* @returns true or false
		*/
		Validation password2 = (regex, password) ->  Pattern.compile(regex).matcher(password).matches();
		System.out.println("Password Validation is " +password2.validate("^(?=.*[A-Z])[A-Za-z0-9]{8,}$", "sdffgGghhgg"));
		
		/*
		* @purpose: As a User need to enter a valid Password having minimum 8 characters and atleast have one upper case and one numeric.
		* 
		* @param: regex,password
		* 
		* @function: To check Password is Valid or not
		* 
		* @returns true or false
		*/
		Validation password3 = (regex, password) ->  Pattern.compile(regex).matcher(password).matches();
		System.out.println("Password Validation is " +password3.validate("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,}$", "sdffgGghh98gg"));
		
		/*
		* @purpose: As a User need to enter a valid Password having minimum 8 characters and atleast have one upper case and one numeric and one special character.
		* 
		* @param: regex,password
		* 
		* @function: To check Password is Valid or not
		* 
		* @returns true or false
		*/
		Validation password4 = (regex, password) ->  Pattern.compile(regex).matcher(password).matches();
		System.out.println("Password Validation is " +password4.validate("^(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_<>/',.])[A-Za-z0-9~!@#$%^&*_<>/',.]{8,}$", "sdffgGgh@h98gg"));
	
	}
}
