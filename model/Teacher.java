package model;

public class Teacher extends Person{
	private String degree;

	public Teacher(Name name, String email, int phone, String degree) {
		super(name, email, phone);
		this.degree = degree;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public void setDegree(String degree) {
	    this.degree = degree;
	  }
}
