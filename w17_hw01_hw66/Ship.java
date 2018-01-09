class Ship extends Transport {
	Ship(String name, double speed) {
		super(name, speed);
	}
	public void move() {
		System.out.println("渡輪在海上航行");
	}
}
