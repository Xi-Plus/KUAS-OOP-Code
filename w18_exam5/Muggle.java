class Muggle extends Person {
	public Muggle(String name, int hp) {
		super(name, hp);
	}
	public void show() {
		System.out.println("我是\""+get_name()+"\"是平民，血量為=\""+get_hp()+"\"");
	}
}
