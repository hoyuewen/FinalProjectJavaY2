package model;

import java.util.ArrayList;

public class ClassGroup {
	private String name;
	private String code;
	private ArrayList <Student> students; 

	public ClassGroup (String name, String code) { 
		this.name = name;
		this.code = code;
		students = new ArrayList <Student>(); 
	}

	public ArrayList <Student> getList (){
		return students; 
	}

	public void addStudent(Student c){
		students.add(c);
	}

	public void remStudent(int i){
		if ((i>-1) && (i < students.size()))   
			students.remove(i);
	}

	public void remStudentByName(String name){
		for (int i = 0 ; i< students.size(); i++)
			if ( getStudent(i).getFirstName().equals(name)         )  
				students.remove(i);
	}

	public Student getStudent(int i){
		if ((i>-1) && (i < students.size()))
			return students.get (i);
		return null;
	}

	public String getPerson2(int i){
		if ((i>-1) && (i < students.size()))
			return students.get (i).getDOB()+ "  "  + students.get (i).getFirstName() +" "+  students.get (i).getLastName()+"\n";
		return null;
	}

	public int getSize (){
		return students.size();
	}
	
	public String getName (){
		return this.name;
	}

	public String toString() {
		for (int i = 0 ; i< students.size(); i++)
			System.out.println( "Name: " + students.get(i).getFirstName() + students.get(i).getLastName()
					+ "\tEmail : " + students.get(i).getEmail()
					+"\tDate of Birth: " + students.get(i).getDOB() 
					+ "\tEmail Address: " + students.get(i).getPhone() );
		return null;
	}
}

