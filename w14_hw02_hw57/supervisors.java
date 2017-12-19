class supervisors extends Employee {
	private int salary;
	public supervisors(String name, String sex, String phone, String address, int year) {
		super(name, sex, phone, address, year);
		this.salary = 50000;
	}
	public int salary() {
		return this.salary + year * 2500 + 1800 + 3000;
	}
	public void show() {
		super.show();
		System.out.println("薪資為" + this.salary());
	}
}
