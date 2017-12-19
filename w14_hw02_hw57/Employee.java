abstract class Employee {
	private String name, sex, phone, address;
	protected int year;
	public Employee(String name, String sex, String phone, String address, int year) {
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.year = year;
	}
	protected abstract int salary();
	protected void show() {
		System.out.println("姓名為" + name);
		System.out.println("性別為" + sex);
		System.out.println("電話為" + phone);
		System.out.println("地址為" + address);
		System.out.println("年資為" + year);
	}
}
