package view;
	
import controller.ClassGradeController;
import controller.ClassGroupController;
import controller.ModuleGradeController;
import controller.StudentController;
import controller.StudentListController;
import controller.TeacherController;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	
	private ClassGroupController controller1;
	private StudentController controller2;
	private StudentListController controller3;
	private TeacherController controller4;
	private ModuleGradeController controller5;
	private ClassGradeController controller6;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			controller1 = new ClassGroupController(this);
			controller2 = new StudentController(this);
			controller3 = new StudentListController(this);
			controller4 = new TeacherController(this);
			controller5 = new ModuleGradeController(this);
			controller6 = new ClassGradeController(this);
			
			
			BorderPane mainPane = new BorderPane();
			Group root = new Group();
			Scene scene = new Scene(root,400,400);
			TabPane tp = new TabPane();
			
			Tab tab1 = new Tab();
			Tab tab2 = new Tab();
			Tab tab3= new Tab();
			Tab tab4 = new Tab();
			Tab tab5 = new Tab();
			Tab tab6 = new Tab();
			Tab tab7 = new Tab();
			tab1.setText("Add or remove class group");
			tab2.setText("Add or remove students");
			tab3.setText("Teacher Details");
			tab4.setText("List all students");
			tab5.setText("List all class-groups");
			tab6.setText("Edit Module-Grade");
			tab7.setText("List Class student grades");
			
			tp.getTabs().addAll(tab1, tab2, tab3, tab4, tab5, tab6, tab7);
			
			//Tab 1
			
			Label className = new Label("Class name: ");
			Label classCode = new Label("Class code: ");
			TextField textClassName = new TextField();
			TextField textClassCode = new TextField();
			
			
			Button buttonAdd = new Button();
			buttonAdd.setText("Add Class");
			buttonAdd.setOnAction(actionEvent -> {
				controller1.addClass(textClassName.getText(), textClassCode.getText());
			});
			
			
			Button buttonRemove = new Button();
			buttonRemove.setText("Remove class");
			buttonRemove.setOnAction(actionEvent -> {
				controller1.removeClass(textClassName.getText(), textClassCode.getText());
			});
			
			
			GridPane grid1 = new GridPane();
			grid1.add(className, 1, 1);
			grid1.add(textClassName, 2, 1);
			grid1.add(classCode, 1, 2);
			grid1.add(textClassCode, 2, 2);
			grid1.add(buttonAdd, 1, 3);
			grid1.add(buttonRemove, 2, 3);
			
			
			
			tab1.setContent(grid1);
			grid1.setAlignment(Pos.CENTER);
			
			
			//Tab 2
			
			
			Label studentFNname = new Label("Student's First Name: ");
			Label studentLNname = new Label("Student's Last Name : ");
			Label studentDOB = new Label("Date of Birth: ");
			Label studentEmail = new Label("Email Address: ");
			Label studentPhone = new Label("Phone number: ");
			
			TextField textStudentFName = new TextField();
			TextField textStudentLName = new TextField();
			TextField textStudentDOB = new TextField();
			TextField textStudentEmail = new TextField();
			TextField textStudentPhone = new TextField();
		
			
			Button buttonAddStudent = new Button();
			buttonAddStudent.setText("Add Student");
			buttonAddStudent.setOnAction(actionEvent -> {
				controller2.addStudent(textStudentFName.getText(), textStudentLName.getText(), Integer.parseInt(textStudentDOB.getText()), textStudentEmail.getText()
						, Integer.parseInt(textStudentPhone.getText()));
			});
			
			
			Button buttonRemoveStudent = new Button();
			buttonRemoveStudent.setText("Remove Student");
			buttonRemoveStudent.setOnAction(actionEvent -> {
				controller2.removeStudent(textStudentFName.getText(), textStudentLName.getText(), Integer.parseInt(textStudentDOB.getText()), textStudentEmail.getText()
						, Integer.parseInt(textStudentPhone.getText()));
			});
			
			
			GridPane grid2 = new GridPane();
			grid2.add(studentFNname, 1, 1);
			grid2.add(textStudentFName, 2, 1);
			grid2.add(studentLNname, 1, 2);
			grid2.add(textStudentLName, 2, 2);
			grid2.add(studentDOB, 1, 3);
			grid2.add(textStudentDOB, 2, 3);
			grid2.add(studentEmail, 1, 4);
			grid2.add(textStudentEmail, 2, 4);
			grid2.add(studentPhone, 1, 5);
			grid2.add(textStudentPhone, 2, 5);
			grid2.add(buttonAddStudent, 1, 7);
			grid2.add(buttonRemoveStudent, 2, 7);
			
			tab2.setContent(grid2);
			grid2.setAlignment(Pos.CENTER);
			
			//tab 3
			
			
			Label teacherFname = new Label("Teacher's First Name: ");
			Label teacherLname = new Label("Teacher's Last Name : ");
			Label teacherMname = new Label("Teacher's Middle Name: ");
			Label teacherQualification = new Label("Teacher's Qualification: ");
			Label teacherEmail = new Label("Email Address: ");
			Label teacherPhone = new Label("Phone number: ");
			
			TextField textTeacherFName = new TextField();
			TextField textTeacherLName = new TextField();
			TextField textTeacherMName = new TextField();
			TextField textTeacherQualification = new TextField();
			TextField textTeacherEmail = new TextField();
			TextField textTeacherPhone = new TextField();
		
			
			Button buttonAddTeacher = new Button();
			buttonAddTeacher.setText("Add Teacher");
			buttonAddTeacher.setOnAction(actionEvent -> {
				controller4.addTeacher(textTeacherFName.getText(), textTeacherLName.getText(), textTeacherMName.getText(), textTeacherQualification.getText()
						, textTeacherEmail.getText(), Integer.parseInt(textTeacherPhone.getText()));
			});
			
			
			Button buttonRemoveTeacher = new Button();
			buttonRemoveTeacher.setText("Remove Teacher");
			buttonRemoveTeacher.setOnAction(actionEvent -> {
				controller4.removeTeacher(textTeacherFName.getText(), textTeacherLName.getText(), textTeacherMName.getText(), textTeacherQualification.getText()
						, textTeacherEmail.getText(), Integer.parseInt(textTeacherPhone.getText()));
			});
			
			Button buttonEditDegree = new Button();
			buttonEditDegree.setText("Edit Degree");
			buttonEditDegree.setOnAction(actionEvent -> {
				controller4.editDegree(textTeacherFName.getText(), textTeacherLName.getText(), textTeacherMName.getText(), textTeacherQualification.getText()
						, textTeacherEmail.getText(), Integer.parseInt(textTeacherPhone.getText()));
			});
			
			GridPane grid3 = new GridPane();
			grid3.add(teacherFname, 1, 1);
			grid3.add(textTeacherFName, 2, 1);
			grid3.add(teacherLname, 1, 2);
			grid3.add(textTeacherLName, 2, 2);
			grid3.add(teacherMname, 1, 3);
			grid3.add(textTeacherMName, 2, 3);
			grid3.add(teacherQualification, 1, 4);
			grid3.add(textTeacherQualification, 2, 4);
			grid3.add(teacherEmail, 1, 5);
			grid3.add(textTeacherEmail, 2, 5);
			grid3.add(teacherPhone, 1, 6);
			grid3.add(textTeacherPhone, 2, 6);
			grid3.add(buttonAddTeacher, 1, 7);
			grid3.add(buttonRemoveTeacher, 2, 7);
			grid3.add(buttonEditDegree, 3, 7);
			
			tab3.setContent(grid3);
			grid3.setAlignment(Pos.CENTER);
			
			
			
			//tab 4
			
			
			Button buttonListStudents = new Button();
			buttonListStudents.setText("List all Students");
			buttonListStudents.setOnAction(actionEvent -> {
				controller3.listStudent();
			});
			
			GridPane grid4 = new GridPane();
			grid4.add(buttonListStudents, 1, 1);
			tab4.setContent(grid4);
			grid4.setAlignment(Pos.CENTER);
			
			//tab 5
			
			Button buttonListClasses = new Button();
			buttonListClasses.setText("List all Class Groups");
			buttonListClasses.setOnAction(actionEvent -> {
				controller3.listClass();
			});
			
			GridPane grid5 = new GridPane();
			grid5.add(buttonListClasses, 1, 1);
			tab5.setContent(grid5);
			grid5.setAlignment(Pos.CENTER);
			
			
			//tab 6
			
			Label moduleName = new Label("Module Name: ");
			Label moduleCode = new Label("Module Code : ");
			
			
			TextField textModuleName = new TextField();
			TextField textModuleCode = new TextField();
		
		
			
			Button buttonAddModule = new Button();
			buttonAddModule.setText("Add Module");
			buttonAddModule.setOnAction(actionEvent -> {
				controller5.addModule(textModuleName.getText(), textModuleCode.getText());
			});
			
			
			Button buttonRemoveModule = new Button();
			buttonRemoveModule.setText("Remove Module");
			buttonRemoveModule.setOnAction(actionEvent -> {
				controller5.removeModule(textModuleName.getText(), textModuleCode.getText());
			});
			
			
			GridPane grid6 = new GridPane();
			grid6.add(moduleName, 1, 1);
			grid6.add(textModuleName, 2, 1);
			grid6.add(moduleCode, 1, 2);
			grid6.add(textModuleCode, 2, 2);
			grid6.add(buttonAddModule, 1, 3);
			grid6.add(buttonRemoveModule, 2, 3);
			
			
			tab6.setContent(grid6);
			grid6.setAlignment(Pos.CENTER);
			
			
			
			
			//tab 7
			
			Label id = new Label("ID Number: ");
			Label email = new Label("Email Address : ");
			Label classgroup = new Label("Class Group : ");
			Label modulecode = new Label("Module Code : ");
			Label grade = new Label("Module Grade : ");
			
			
			TextField textID = new TextField();
			TextField textEmail = new TextField();
			TextField textClassGroup = new TextField();
			TextField textModuleCode1 = new TextField();
			TextField textGrade = new TextField();
		
			
			Button buttonAddClassGrade = new Button();
			buttonAddClassGrade.setText("Add Module");
			buttonAddClassGrade.setOnAction(actionEvent -> {
				controller6.addModule(Integer.parseInt(textID.getText()), textEmail.getText(), textClassGroup.getText(), textModuleCode1.getText()
						, Float.parseFloat(textGrade.getText()));
			});
			
			
			Button buttonRemoveClassGrade = new Button();
			buttonRemoveClassGrade.setText("Remove Module");
			buttonRemoveClassGrade.setOnAction(actionEvent -> {
				controller6.removeModule(Integer.parseInt(textID.getText()), textEmail.getText(), textClassGroup.getText(), textModuleCode1.getText()
						, Float.parseFloat(textGrade.getText()));
			});
			
			
			GridPane grid7 = new GridPane();
			grid7.add(id, 1, 1);
			grid7.add(textID, 2, 1);
			grid7.add(email, 1, 2);
			grid7.add(textEmail, 2, 2);
			grid7.add(classgroup, 1, 3);
			grid7.add(textClassGroup, 2, 3);
			grid7.add(modulecode, 1, 4);
			grid7.add(textModuleCode1, 2, 4);
			grid7.add(grade, 1, 5);
			grid7.add(textGrade, 2, 5);
			grid7.add(buttonAddClassGrade, 1, 6);
			grid7.add(buttonRemoveClassGrade, 2, 6);
			
			
			tab7.setContent(grid7);
			grid7.setAlignment(Pos.CENTER);
			
			
			
			
			
			mainPane.setCenter(tp);
			mainPane.prefHeightProperty().bind(scene.heightProperty());
			mainPane.prefWidthProperty().bind(scene.widthProperty()); 
			root.getChildren().add(mainPane);
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
