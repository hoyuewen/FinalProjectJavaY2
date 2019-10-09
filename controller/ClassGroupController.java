package controller;

import java.util.ArrayList;

import SQL.ClassGroupDB;
import SQL.StudentDB;
import model.ClassGroup;
import model.School;
import view.Main;

public class ClassGroupController {
	private Main main;
	private ClassGroupDB classgroupdb;
	School school = new School();
	
	public ClassGroupController(Main lucas) {
		//lucas = this.lucas;
		classgroupdb = new ClassGroupDB();
	} 
	
	public void addClass(String classname, String code) {
		ClassGroup newclass = new ClassGroup(classname, code);
		school.addClasses(newclass);
		System.out.print("Info Added.\n ");
		classgroupdb.addClass(classname, code);
	}
	
	
	public void removeClass(String classname, String code) {
		school.remClassByName(classname);
		System.out.print("Info removed.\n");
		classgroupdb.removeClass(classname, code);
	}
}
