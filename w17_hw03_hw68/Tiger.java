class Tiger extends Animal implements Attack {
	Tiger(String name, String color) {
		super(name, color);
	}
	public void show() {
		System.out.println("我是動物\"Tiger\"，我的名稱是"+get_name()+"，顏色\""+get_color()+"\"，我會咬人");
	}
	public void attack() {
		System.out.println("我是動物\"Tiger\"，我會咬人");
	}
}
