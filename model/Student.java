package model;

import java.util.ArrayList;

public class Student extends Person{
	private int dob;
	private ArrayList<ModuleGrade> subjects;


	public Student(Name name, String email, int phone, int dob) {
		super(name, email, phone);
		this.dob = dob;
		subjects = new ArrayList<ModuleGrade>();
	}


	public ArrayList <ModuleGrade> getSubjects (){
		return subjects; 
	}

	public void addSubject(ModuleGrade c){
		subjects.add(c);
	}

	public void remSubject(int i){
		if ((i>-1) && (i < subjects.size())) 
			subjects.remove(i);
	}

	public int getDOB() {
		return this.dob;
	}
	
	public int getPhone(Student st) {
		int a = st.getPhone();
		return a;
	}
	
	public String getEmail(Student st) {
		String a = st.getEmail();
		return a;
	}
}
