class Air extends Person {
	private final String type = "我是空軍!";
	Air(String name, String rank) {
		super(name, rank);
	}
	void saymyselftype() {
		System.out.println(type);
	}
}
