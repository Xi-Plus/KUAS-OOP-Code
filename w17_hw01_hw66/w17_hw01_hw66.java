import java.io.*;

public class w17_hw01_hw66 {
	public static void main(String arg[]) {
		Transport transport[] = new Transport[3];
		transport[0] = new Car("CAR", 40.0);
		transport[1] = new Ship("SHIP", 20.0);
		transport[2] = new Plane("PLANE", 100.0);

		for (Transport temp:transport) {
			temp.show();
			temp.move();
			System.out.println();
		}
	}
}
