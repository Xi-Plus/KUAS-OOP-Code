import java.io.*;

public class w18_exam1 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("請輸入姓名：");
		String name = buf.readLine();
		System.out.print("請輸入員工編號：");
		int number = Integer.parseInt(buf.readLine());
		System.out.print("請輸入年資：");
		int year = Integer.parseInt(buf.readLine());

		Employee employee = new Employee();
		employee.set_name(name);
		employee.set_number(number);
		employee.set_year(year);
		employee.show();
	}
}
