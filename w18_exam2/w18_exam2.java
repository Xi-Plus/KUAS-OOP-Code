import java.io.*;

public class w18_exam2 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		Student stu_1 = new Student();
		Student stu_2 = new Student("金小強", "男");
		stu_1.showStudent();
		stu_2.showStudent();
	}
}
