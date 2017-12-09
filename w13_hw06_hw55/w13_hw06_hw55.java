import package_Person.Person;

public class w13_hw06_hw55 {
	public static void main(String[] args) {
		Student s1 = new Student("男", "政廷", "一");
		s1.showProfile();
	}
}

class Student extends Person {
	private String grade;

	Student(String person_name, String person_gender, String grade) {
		super(person_gender, person_name);
		setGrade(grade);
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}

	public void showProfile() {
		super.showProfile();	
		System.out.print("該學生為 : " + grade + " 年級的學生");
	}
}
