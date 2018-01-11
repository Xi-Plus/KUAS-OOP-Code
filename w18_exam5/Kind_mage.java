class Kind_mage extends Person implements Magic {
	private int mp;
	public Kind_mage(String name, int hp) {
		super(name, hp);
		set_mp();
	}
	public void set_mp() {
		this.mp = (int)(Math.random()*mp_Max);
	}
	public int get_mp() {
		return mp;
	}
	public void magic_atk() {
		if (mp <= 30) {
			System.out.println("攻擊魔法：Kind Lv.1");
		} else if (mp <= 70) {
			System.out.println("攻擊魔法：Kind Lv.2");
		} else {
			System.out.println("攻擊魔法：Kind Lv.3");
		}
	}
	public void magic_def() {
		if (mp <= 30) {
			System.out.println("防禦魔法：Kind Lv.1");
		} else if (mp <= 70) {
			System.out.println("防禦魔法：Kind Lv.2");
		} else {
			System.out.println("防禦魔法：Kind Lv.3");
		}
	}
	public void show() {
		System.out.println("我是\""+get_name()+"\"是好法師，血量為=\""+get_hp()+"\"");
	}
}
