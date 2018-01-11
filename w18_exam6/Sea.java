class Sea extends Person {
	private final String type = "我是海軍!";
	Sea(String name, String rank) {
		super(name, rank);
	}
	void saymyselftype() {
		System.out.println(type);
	}
}
