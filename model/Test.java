package model;

public class Test {
	public static void main(String[] args) {
		ClassGroup cg1 = new ClassGroup("Computer Systems", "KDNET");

		Name name1 = new Name("Ho ", "Yue Wen");
		Name name2 = new Name ("Patrick ", "Lee");
		Student st1 = new Student(name1, "yue.ho@mycit.ie", 2042920, 423);
		Student st2 = new Student(name2, "patrick.lee@mycit.ie", 6598256, 532);
		
		cg1.addStudent(st1);
		cg1.addStudent(st2);
		
		System.out.println(cg1);
		/*System.out.println(ol.add(d));
		System.out.println(ol.add(v));
		System.out.println(ol.add(i));

		ol.remove(0);
		System.out.println(ol.add(i));


*/
	
}
}
