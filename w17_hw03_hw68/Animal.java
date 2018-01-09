abstract class Animal {
	private String name;
	private String color;
	Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public void show() {
		System.out.println("我的名稱是"+name+"，顏色\""+color+"\"");
	}
	public void set_name(String name) {
		this.name = name;
	}
	public void set_color(String color) {
		this.color = color;
	}
	public String get_name() {
		return name;
	}
	public String get_color() {
		return color;
	}
}
