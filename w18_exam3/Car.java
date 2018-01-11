package traffic.car;
import traffic.Traffic;
public class Car extends Traffic {
	public Car(String name, double gas_L, double loss) {
		super(name, gas_L, loss);
	}
	public void show_message() {
		System.out.println(get_name()+"還可以在道路上行駛"+cal_Distabce()+"公里");
	}
}
