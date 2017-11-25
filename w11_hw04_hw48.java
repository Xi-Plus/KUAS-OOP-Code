import java.io.*;
import java.util.regex.Pattern;

class w11_hw04_hw48 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String name, telephone;
		int year;

		System.out.print("請輸入員工姓名:");
		name = buf.readLine();
		System.out.print("請輸入員工手機:");
		telephone = buf.readLine();
		System.out.print("謮輸入員工年資:");
		year = Integer.parseInt(buf.readLine());
		Employee e1 = new Employee(name, telephone, year);

		Employee e2 = new Employee();
		System.out.print("請輸入員工姓名:");
		name = buf.readLine();
		e2.set_name(name);
		System.out.print("請輸入員工手機:");
		telephone = buf.readLine();
		e2.set_telephone(telephone);
		System.out.print("謮輸入員工年資:");
		year = Integer.parseInt(buf.readLine());
		e2.set_year(year);

		e1.showProfile();
		e2.showProfile();
	}
}
class Employee {
	private String name, telephone;
	private int year;
	Employee() {
		this("", "", 1);
	}
	Employee(String name, String telephone, int year) {
		set_name(name);
		set_telephone(telephone);
		set_year(year);
	}
	public void set_name(String name) {
		this.name = name;
	}
	public void set_telephone(String telephone) {
		if (telephone.matches("09\\d{8}")) {
			this.telephone = telephone;
		} else {
			this.telephone = "0912345678";
		}
	}
	public void set_year(int year) {
		if (year < 1) {
			this.year = 1;
		} else if (year > 30) {
			this.year = 1;
		} else {
			this.year = year;
		}
	}
	public String get_name() {
		return name;
	}
	public String get_telephone() {
		return telephone;
	}
	public int get_year() {
		return year;
	}
	public void showProfile() {
		System.out.println("員工姓名:"+name);
		System.out.println("員工手機:"+telephone);
		System.out.println("員工年資:"+year);
	}
}
