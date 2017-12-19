import java.util.*;

class Management {
	private List<Employee> people = new ArrayList<Employee>();
	public void addperson(int type, String name, String sex, String phone, String address, int year) {
		if (type == 1) {
			people.add(new Basic_Employee(name, sex, phone, address, year));
		} else if (type == 2) {
			people.add(new managers(name, sex, phone, address, year));
		} else if (type == 3) {
			people.add(new supervisors(name, sex, phone, address, year));
		}
	}
	public int calccost() {
		int total = 0;
		for (Employee temp:people) {
			total += temp.salary();
		}
		return total;
	}
}
