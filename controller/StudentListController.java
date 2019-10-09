package controller;

import model.ClassGroup;
import model.School;
import view.Main;

public class StudentListController {
	private Main main;
	School school = new School();
	
	public StudentListController(Main lucas) {
		//lucas = this.lucas;
	} 
	
	public void listClass() {
		for (int i = 0 ; i< school.getSize(); i++) {
			System.out.print(school.getClass(i).getList());
		}
		
	}
	
	
	public void listStudent() {
		for (int i = 0 ; i< school.getSize(); i++) {
				ClassGroup classRequest = school.getClass(i);
				for (int a = 0 ; a< classRequest.getSize(); a++) {
					classRequest.getStudent(a);
				}
		}
	}
	
	public void listTeacher() {
		for (int i = 0 ; i< school.getSize(); i++) {
				ClassGroup classRequest = school.getClass(i);
				for (int a = 0 ; a< classRequest.getSize(); a++) {
					classRequest.getStudent(a);
				}
		}
	}
}
