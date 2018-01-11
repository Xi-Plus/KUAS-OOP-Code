import java.util.*;
class Student {
	private String name, sex, ID;
	private final int date;
	private static int count=0;

	Student() {
		this("第"+(count+1)+"位學生", "無");
	}
	Student(String name, String sex) {
		this.name = name;
		this.sex = sex;
		this.date = new Date().getYear()-11;
		count++;
		this.ID = this.date+""+count;
	}
	void showStudent() {
		System.out.println("姓名為"+name+"，性別為"+sex+"，學號為"+ID);
	}
}
