package day02.practice;


/*
 * Question#1 (For Encapsulation): Create a **User** class with attribute id, name, password, emailId 
 * and create setters and getters for the same. Please note no attribute should be available publicly they should be only be accessible via the access modifiers.
 */

 class User {
	
	private int id;
    private String name;
    private String password;
    private String emailId;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
 
 public class UserEncapsulation{
	 
	 public static void main(String[] args) {
		User userdata=new User();
		userdata.setId(10);
		userdata.setName("sandeep");
		userdata.setPassword("san12ok");
		userdata.setEmailId("sandeep@gmail.com");
		
		
		System.out.println(userdata.getId());
        System.out.println(userdata.getName());
        System.out.println(userdata.getEmailId());
        System.out.println(userdata.getPassword());

	}
	 
	 
	 
 }
