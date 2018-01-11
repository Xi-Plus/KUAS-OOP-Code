class Employee {
	private String name;
	private int number, year;
	String get_name() {
		return name;
	}
	int get_number() {
		return number;
	}
	int get_year() {
		return year;
	}
	void set_name(String name) {
		this.name = name;
	}
	void set_number(int number) {
		this.number = number;
	}
	void set_year(int year) {
		this.year = year;
	}
	void show() {
		System.out.println("員工姓名："+name+"，員工編號為："+number+"，年資："+year);
	}
}
