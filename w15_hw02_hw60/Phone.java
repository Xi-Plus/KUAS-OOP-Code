abstract class Phone {
	private double time1, time2;
	Phone(double time1, double time2) {
		this.time1 = time1;
		this.time2 = time2;
	}
	public void setTime1(double time1) {
		this.time1 = time1;
	}
	public double getTime1() {
		return time1;
	}
	public void setTime2(double time2) {
		this.time2 = time2;
	}
	public double getTime2() {
		return time2;
	}
	abstract double calculatePrice();
	abstract void showMessage();
}
