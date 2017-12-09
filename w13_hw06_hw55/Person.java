package package_Person;

public class Person {
	private final String person_gender;
	String person_name;

	protected Person(String person_gender, String person_name) {
		this.person_gender = person_gender;
		setPerson_name(person_name);
	}

	protected void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	protected String getPerson_name() {
		return person_name;
	}

	protected void showProfile() {
		System.out.print("學生姓名：" + person_name + "，");
		System.out.println("學生性別：" + person_gender);
	}
}
