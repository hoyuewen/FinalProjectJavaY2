package model;

public class Person {
	private Name name;
	private String email;
	private int phone;

	public Person(Name name, String email, int phone) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		
	}
	
	public Person(String fname, String mname, String lname, String email, int phone) {
		name = new Name(fname, mname, lname);
		this.phone = phone;
		this.email = email;
	}
	
	public Person(String firstName, String middleName, String lastName) {
		name.setMiddleName(middleName);
		name.setFirstName(firstName);
		name.setLastName(lastName);
	}
	
	public Person(String firstName, String lastName) {
		name.setFirstName(firstName);
		name.setLastName(lastName);
	}

	public String getMiddlename() {
		return name.getMiddlename();
	}
	
	public String getFirstName() {
		return name.getFirstName();
	}
	
	public String getLastName() {
		return name.getLastName();
	}
	
	public int getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
}
