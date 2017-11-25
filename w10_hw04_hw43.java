import java.io.*;

public class w10_hw04_hw43 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入員工資訊[名稱,職位,年資]：");
		String temp = buf.readLine();
		String arr[] = temp.split(",");

		Employee employee;
		if (arr.length == 3) {
			employee = new Employee(arr[0], arr[1], Integer.parseInt(arr[2]));
		} else if (arr.length == 2) {
			try {
				int year = Integer.parseInt(arr[1]);
				employee = new Employee(arr[0], year);
			} catch (Exception e) {
				employee = new Employee(arr[0], arr[1]);
			}
		} else {
			employee = new Employee();
		}
		employee.show();
	}
}
class Employee {
	private String name, position;
	private int year, money;
	Employee()  {
		this("", "", -1);
	}
	Employee(String name, String position)  {
		this(name, position, -1);
	}
	Employee(String name, int year)  {
		this(name, "", year);
	}
	Employee(String name, String position, int year) {
		this.setName(name);
		this.setPosition(position);
		this.setYear(year);
		this.setmoney();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setPosition(String position) {
		String accept[] = new String[]{"一般員工", "主管", "部長"};
		for (int q=0; q<accept.length; q++) {
			if (position.equals(accept[q])) {
				this.position = position;
				return;
			}
		}
		this.position = "一般員工";
	}
	public String getPosition() {
		return this.position;
	}
	public void setYear(int year) {
		if (year >= 0 && year <= 15) {
			this.year = year;
		} else {
			this.year = 1;
		}
	}
	public int getYear() {
		return this.year;
	}
	private void setmoney() {
		switch (this.position) {
			case "一般員工":
				this.money = 22000;
				break;
			case "主管":
				this.money = 40000;
				break;
			case "部長":
				this.money = 55000;
				break;
		}
		if (this.year <= 5) {
			this.money += 2000;
		} else if (this.year <= 10) {
			this.money += 6000;
		} else if (this.year <= 15) {
			this.money += 12000;
		}
	}
	public void show() {
		System.out.println("員工資訊：\n姓名："+this.name+"，職位："+this.position+"，年資："+this.year+"，月薪："+this.money);
	}
}
