package model;

public class Name {
	private String middleName;
	private String firstName;
	private String lastName;

	public Name(String firstName, String middleName, String lastName) {
		this.middleName = middleName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getMiddlename() {
		return middleName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
