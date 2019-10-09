# FinalProjectJavaY2
Teacher Student Class GUI with MySQL

This is the final project listed inside the CV.This project uses the MVC Architecture.
SQL folder contains all sql queries including create new tables, update information and insert new fields. It instantiates a connection when the GUI is run. All files in this folder are only responsible for one class

View folder has the main class which jumpstarts the whole application. This particular application is built using JavaFX. I have commented out the tabs so it is easier to separate the different classes

Model folder contains all the classes of the individual objects. In this application, a person has a name and is either a studentor a teacher. A school has some classgroups, and the students are in the classgroups. A student has many modules and a teacher can teach many modules, but every module can only have 1 teacher.
