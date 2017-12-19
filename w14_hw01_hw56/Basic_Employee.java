class Basic_Employee extends Employee {
	private int salary;
	public Basic_Employee(String name, String sex, String phone, String address, int year) {
		super(name, sex, phone, address, year);
		this.salary = 30000;
	}
	public int salary() {
		return this.salary + year * 1500;
	}
	public void show() {
		super.show();
		System.out.println("薪資為" + this.salary());
	}
}
