package controller;

import SQL.ClassGradeDB;
import SQL.ClassGroupDB;
import model.ClassGroup;
import model.School;
import view.Main;

public class ClassGradeController {
	private Main main;
	private ClassGradeDB classgradedb;
	School school = new School();
	
	public ClassGradeController(Main lucas) {
		//lucas = this.lucas;
		classgradedb = new ClassGradeDB();
	} 
	
	public void addModule(int id, String email, String classGroup, String moduleCode, Float grade) {
		classgradedb.addClass(id, email, classGroup, moduleCode, grade);
		System.out.print("Info Added.\n ");
		
	}
	
	
	public void removeModule(int id, String email, String classGroup, String moduleCode, Float grade) {
		classgradedb.removeClass(id, email, classGroup, moduleCode, grade);
		System.out.print("Info removed.\n");
		
	}
}

