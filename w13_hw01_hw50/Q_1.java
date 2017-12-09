import java.io.*;

public class Q_1 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入半徑：");
		double r = Double.parseDouble(buf.readLine());
		Circle c = new Circle(r);
	}
}
class Circle {
	private final double pi = 3.14;

	Circle(double r) {
		System.out.println("圓的面積為:" + r*r*pi);
	}
}
