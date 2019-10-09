package controller;

import SQL.ModuleGradeDB;
import SQL.StudentDB;
import model.ModuleGrade;
import model.Name;
import model.School;
import model.Student;
import view.Main;

public class ModuleGradeController {
	private ModuleGradeDB moduledb;
	private Main main;
	School school = new School();
	
	public ModuleGradeController(Main lucas) {
		//lucas = this.lucas;
		moduledb = new ModuleGradeDB();
	} 
	
	public void addModule(String name, String code) {
		ModuleGrade newModule = new ModuleGrade(name, code);
		
		moduledb.addModule(name, code);
		
		
		System.out.print("Info Added.\n ");
	}
	
	
	public void removeModule(String name, String code) {
		ModuleGrade newModule = new ModuleGrade(name, code);
		
		moduledb.removeModule(name, code);		
						
			
		System.out.print("Info removed.\n");			
			
		
	}
}




