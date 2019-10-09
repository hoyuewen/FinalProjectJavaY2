package controller;

import java.util.ArrayList;

import SQL.StudentDB;
import model.ClassGroup;
import model.Name;
import model.School;
import model.Student;
import view.Main;


public class StudentController {
		private StudentDB studentdb;
		private Main main;
		School school = new School();
		
		public StudentController(Main lucas) {
			//lucas = this.lucas;
			studentdb = new StudentDB();
		} 
		
		public void addStudent(String fname, String lname, int dob, String email, int phone) {
			Name newName = new Name(fname, lname);
			Student newStudent = new Student(newName, email, dob, phone);
			studentdb.addStudent(fname, lname, dob, email, phone);
			
			
			System.out.print("Info Added.\n ");
		}
		
		
		public void removeStudent(String fname, String lname, int dob, String email, int phone) {
			Name newName = new Name(fname, lname);
			Student newStudent = new Student(newName, email, dob, phone);
			
			studentdb.removeStudent(fname, lname, dob, email, phone);		
							
				
			System.out.print("Info removed.\n");			
				
			
		}
	}


