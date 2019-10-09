package controller;

import SQL.StudentDB;
import SQL.TeacherDB;
import model.Name;
import model.School;
import model.Student;
import model.Teacher;
import view.Main;

public class TeacherController {
	private TeacherDB teacherdb;
	private Main main;
	School school = new School();
	
	public TeacherController(Main lucas) {
		//lucas = this.lucas;
		teacherdb = new TeacherDB();
	} 
	
	public void addTeacher(String fname, String lname, String mname, String qualification, String email, int phone) {
		Name newName = new Name(fname, mname, lname);
		Teacher newTeacher = new Teacher(newName, email, phone, qualification);
		teacherdb.addTeacher(fname, lname, mname, qualification, email, phone);
		
		
		System.out.print("Info Added.\n ");
	}
	
	
	public void removeTeacher(String fname, String lname, String mname, String qualification, String email, int phone) {
		Name newName = new Name(fname, lname);
		Teacher newTeacher = new Teacher(newName, email, phone, qualification);
		
		teacherdb.removeTeacher(fname, lname, mname, qualification, email, phone);		
						
			
		System.out.print("Info removed.\n");			
			
		
	}
	
	public void editDegree(String fname, String lname, String mname, String qualification, String email, int phone) {
		Name newName = new Name(fname, lname);
		Teacher newTeacher = new Teacher(newName, email, phone, qualification);
		
		teacherdb.editDegree(fname, lname, mname, qualification, email, phone);		
						
			
		System.out.print("Info edited.\n");			
			
		
	}
}
