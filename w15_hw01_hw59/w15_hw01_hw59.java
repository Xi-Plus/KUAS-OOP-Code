import java.io.*;

public class w15_hw01_hw59 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		Bike bike = new Bike(10);
		Ship ship = new Ship(20, 100);
		Plane plane = new Plane(100, 200);

		System.out.print("用哪種方式運送貨物？ 1. Bike 2. Ship 3. Plane：");
		int type = Integer.parseInt(buf.readLine());
		Vehicle vehicle;
		switch (type) {
			case 1:
				vehicle = bike;
				break;
			case 2:
				vehicle = ship;
				break;
			case 3:
				vehicle = plane;
				break;
			default:
				System.out.println("輸入錯誤");
				return;
		}
		
		if (vehicle.move()) {
			System.out.print("請輸入重量：");
			int weight = Integer.parseInt(buf.readLine());
			System.out.print("請輸入距離：");
			int distance = Integer.parseInt(buf.readLine());

			((Delivery)vehicle).delivery(weight, distance);
		}
	}
}
