class Person {
	private String name;
	private int hp;
	Person(String name, int hp) {
		set_name(name);
		set_hp(hp);
	}
	void set_name(String name) {
		this.name = name;
	}
	void set_hp(int hp) {
		this.hp = hp;
	}
	String get_name() {
		return name;
	}
	int get_hp() {
		return hp;
	}
	void show() {
		System.out.println("姓名為"+name+"，血量為"+hp);
	}
}
