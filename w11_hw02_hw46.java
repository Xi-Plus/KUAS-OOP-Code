import java.io.*;

class w11_hw02_hw46 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		Student stu = new Student();
		stu.set_student_number("1105108138");
		stu.set_major("CSIE");
		stu.showProfile();
		stu.calcBMI();
	}
}

class Student extends Person {
	private String student_number, major;
	public void set_student_number(String student_number) {
		this.student_number = student_number;
	}
	public void set_major(String major) {
		this.major = major;
	}
	public String get_student_number(String kmh) {
		return student_number;
	}
	public String get_major(String major) {
		return major;
	}
	public void showProfile() {
		super.showProfile();
		System.out.println("學號："+student_number+" 主修課程："+major);
	}
}
