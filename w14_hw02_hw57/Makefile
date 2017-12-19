run: compile
	java w14_hw02_hw57

compile: w14_hw02_hw57.class Management.class Employee.class Basic_Employee.class managers.class supervisors.class

w14_hw02_hw57.class: w14_hw02_hw57.java Management.class
	javac -encoding utf8 w14_hw02_hw57.java

Management.class: Management.java Employee.class Basic_Employee.class managers.class supervisors.class
	javac -encoding utf8 Management.java

Employee.class: Employee.java
	javac -encoding utf8 Employee.java

Basic_Employee.class: Basic_Employee.java Employee.class
	javac -encoding utf8 Basic_Employee.java

managers.class: managers.java Employee.class
	javac -encoding utf8 managers.java

supervisors.class: supervisors.java Employee.class
	javac -encoding utf8 supervisors.java

clean:
	del /Q *.class
