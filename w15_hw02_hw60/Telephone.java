public class Telephone extends Phone {
	private final int price1 = 1, price2 = 5;
	public Telephone(double time1, double time2) {
		super(time1, time2);
	}
	public double calculatePrice() {
		return getTime1() * price1 + getTime2() * price2;
	}
	public void showMessage() {
		System.out.println("室內電話通話費為"+calculatePrice());
	}
}
