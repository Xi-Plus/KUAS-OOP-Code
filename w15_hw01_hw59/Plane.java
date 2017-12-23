public class Plane extends Vehicle implements Delivery {
	private int price;
	public Plane(double speed, int price) {
		super(speed);
		this.price = price;
	}
	public boolean move() {
		System.out.println("飛機可以乘載物品");
		return true;
	}
	public void delivery(int weight, int distance) {
		if (weight > MaxWeight) {
			System.out.println("貨物過重");
		} else {
			System.out.println("總價為"+weight*price*distance);
		}
	}
}
