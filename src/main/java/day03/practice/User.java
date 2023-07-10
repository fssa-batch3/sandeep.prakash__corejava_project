package day03.practice;

/*
 * Question#2: Create a User class with 2 constructors.
 *  the second overloaded constructor User(name, password, emailId)
 */

public class User {

	private String name;
	private String password;
	private String email;
	
	public User() {
		
	}

	public User(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;

	}

	public static void main(String[] args) {
		User details=new User("sandeep","sandok98","sandeep@gmail.com");
		System.out.println("name= "+details.name);
		System.out.println("password= "+details.password);
		System.out.println("email= "+details.email);
	}
}
