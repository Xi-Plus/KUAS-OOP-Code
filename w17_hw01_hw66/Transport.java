abstract class Transport {
	private String name;
	private double speed;
	Transport(String name, double speed) {
		this.name = name;
		this.speed = speed;
	}
	public void show() {
		System.out.println("名稱為"+name+"，時速為"+speed);
	}
	public void set_name(String name) {
		this.name = name;
	}
	public void set_speed(double speed) {
		this.speed = speed;
	}
	public String get_name() {
		return name;
	}
	public double get_speed() {
		return speed;
	}
	public abstract void move();
}
