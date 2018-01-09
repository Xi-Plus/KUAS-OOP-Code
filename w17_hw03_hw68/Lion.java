class Lion extends Animal {
	Lion(String name, String color) {
		super(name, color);
	}
	public void show() {
		System.out.println("我是動物\"Lion\"，我的名稱是"+get_name()+"，顏色\""+get_color()+"\"，我會咬人");
	}
	public void attack() {
		System.out.println("我是動物\"Lion\"，我會咬人");
	}
}