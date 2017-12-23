public class Tablet extends Phone implements internet {
	private final int price1 = 3, price2 = 13, price3 = 200;
	private double time3;
	public Tablet(double time1, double time2, double time3) {
		super(time1, time2);
		this.time3 = time3;
	}
	public double internetPrice() {
		double result = time3 * hourprice;
		if (result > 1000) {
			result = 1000;
		}
		return result;
	}
	public double calculatePrice() {
		return getTime1() * price1 + getTime2() * price2 + price3 + internetPrice();
	}
	public void showMessage() {
		System.out.println("平板裝置通話費為"+calculatePrice());
	}
}
