package userregistrationlambda;

/*
 * Creation of an Interface named as Validation
 */
public interface Validation {
	
	/*
	 * An Abstract method named as validate
	 * 
	 * @param regex, detail
	 * 
	 * @returntype boolean
	 * 
	 */
	boolean validate(String regex, String detail);

}
