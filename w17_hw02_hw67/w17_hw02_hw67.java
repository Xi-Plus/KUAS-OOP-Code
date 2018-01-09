import java.io.*;

public class w17_hw02_hw67 {
	public static void main(String arg[]) {
		Transport transport[] = new Transport[3];
		transport[0] = new Car("CAR", 40.0);
		transport[1] = new Ship("SHIP", 20.0);
		transport[2] = new Plane("PLANE", 100.0);

		for (Transport temp:transport) {
			temp.show();
			temp.move();
			// try {
			// 	((Car)temp).atk();
			// } catch (ClassCastException e) {

			// }
			if (temp instanceof Car) {
				((Car)temp).atk();
			}
			System.out.println();
		}
	}
}
