public class Bike extends Vehicle {
	public Bike(double speed) {
		super(speed);
	}
	public boolean move() {
		System.out.println("腳踏車無法乘載物品");
		return false;
	}
}
