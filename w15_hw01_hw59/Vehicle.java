abstract class Vehicle {
	private double speed;
	Vehicle(double speed) {
		this.speed = speed;
	}
	abstract boolean move();
}
