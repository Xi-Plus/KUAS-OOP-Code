import java.io.*;
import traffic.Traffic;
import traffic.car.Car;
import traffic.ship.Ship;

public class w18_exam3 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		Traffic traffic[] = new Traffic[2];
		traffic[0] = new Car("轎車", 28.0, 5.0);
		traffic[1] = new Ship("輪船", 125.0, 50.0);

		for (int q=0; q<traffic.length; q++) {
			traffic[q].show_message();
		}
	}
}
