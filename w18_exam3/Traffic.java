package traffic;
public abstract class Traffic {
	private String name;
	private double gas_L, loss;
	public Traffic(String name, double gas_L, double loss) {
		set_name(name);
		set_gas_L(gas_L);
		set_loss(loss);
	}
	public void set_name(String name) {
		this.name = name;
	}
	public void set_gas_L(double gas_L) {
		this.gas_L = gas_L;
	}
	public void set_loss(double loss) {
		this.loss = loss;
	}
	public String get_name() {
		return name;
	}
	public double get_gas_L() {
		return gas_L;
	}
	public double get_loss() {
		return loss;
	}
	public double cal_Distabce() {
		return gas_L / loss;
	}
	public abstract void show_message();
}
