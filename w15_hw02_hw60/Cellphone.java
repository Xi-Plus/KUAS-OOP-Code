public class Cellphone extends Phone implements internet {
	private final int price1 = 2, price2 = 10, price3 = 250;
	private double time3;
	public Cellphone(double time1, double time2, double time3) {
		super(time1, time2);
		this.time3 = time3;
	}
	public double internetPrice() {
		double result = time3 * hourprice;
		if (result > 1300) {
			result = 1300;
		}
		return result;
	}
	public double calculatePrice() {
		return getTime1() * price1 + getTime2() * price2 + price3 + internetPrice();
	}
	public void showMessage() {
		System.out.println("行動電話通話費為"+calculatePrice());
	}
}
