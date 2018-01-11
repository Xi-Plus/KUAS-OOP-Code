package traffic.ship;
import traffic.Traffic;
public class Ship extends Traffic {
	public Ship(String name, double gas_L, double loss) {
		super(name, gas_L, loss);
	}
	public void show_message() {
		System.out.println(get_name()+"還可以在海上航行"+cal_Distabce()+"公里");
	}
}
