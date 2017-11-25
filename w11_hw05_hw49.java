import java.io.*;
import java.util.regex.Pattern;

class w11_hw05_hw49 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String name, telephone, skill;
		int year, salary;

		System.out.print("請輸入工程師姓名:");
		name = buf.readLine();
		System.out.print("請輸入工程師手機:");
		telephone = buf.readLine();
		System.out.print("謮輸入工程師年資:");
		year = Integer.parseInt(buf.readLine());
		System.out.print("謮輸入工程師薪水:");
		salary = Integer.parseInt(buf.readLine());
		System.out.print("請輸入工程師專長:");
		skill = buf.readLine();
		Engineer e1 = new Engineer(name, telephone, year, salary, skill);

		e1.showProfile();
	}
}

class Engineer extends Employee {
	private String skill;
	private int salary;
	Engineer(String name, String telephone, int year, int salary, String skill) {
		set_name(name);
		set_telephone(telephone);
		set_year(year);
		set_salary(salary);
		set_skill(skill);
	}
	public void set_skill(String skill) {
		this.skill = skill;
	}
	public void set_salary(int salary) {
		this.salary = salary;
	}
	public String get_skill() {
		return skill;
	}
	public int get_salary() {
		return salary;
	}
	private int getYearSalary() {
		int year = get_year();
		if (year <= 5) {
			return (int)(salary * 12 * 1.1);
		} else if (year <= 15) {
			return (int)(salary * 12 * 1.2);
		} else if (year <= 25) {
			return (int)(salary * 12 * 1.3);
		} else {
			return (int)(salary * 12 * 1.4);
		}
	}
	public void showProfile() {
		System.out.println("工程師姓名:"+get_name());
		System.out.println("工程師手機:"+get_telephone());
		System.out.println("工程師年資:"+get_year());
		System.out.println("工程師薪水:"+salary);
		System.out.println("工程師專長:"+skill);
		System.out.println("工程師年薪:"+getYearSalary());
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
