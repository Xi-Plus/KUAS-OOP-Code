class Land extends Person {
	private final String type = "我是陸軍!";
	Land(String name, String rank) {
		super(name, rank);
	}
	void saymyselftype() {
		System.out.println(type);
	}
}
