package model;

import java.util.ArrayList;

public class School {

		private ArrayList<ClassGroup> classes;

		public School() {
			classes = new ArrayList<ClassGroup>();
		}
		
		public void addClasses(ClassGroup cg){
		     classes.add(cg);
		}
		public int getSize() {
			return classes.size();
		}
		
		
		public void remClass(int i){
			if ((i>-1) && (i < classes.size()))   
				classes.remove(i);
			}
		
		public ClassGroup getClass(int i) {
			return classes.get(i);
		}
		
		public void remClassByName(String classname){
			for (int i = 0 ; i< classes.size(); i++)
				if ( getClass(i).getName().equals(classname)         )  
					classes.remove(i);
		}
}
