import java.io.*;

class w9_hw03_hw37 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		cylinder c = new cylinder();
		System.out.print("請輸入半徑：");
		c.set_radius(Integer.parseInt(buf.readLine()));
		System.out.print("請輸入高：");
		c.set_high(Integer.parseInt(buf.readLine()));

		System.out.print("請選擇要顯示的項目(1.表面積 2.體積 3.所有資訊)：");
		int n = Integer.parseInt(buf.readLine());
		switch (n) {
			case 1:
				System.out.println("圓柱體的表面積為："+c.surface_area());
				break;
			case 2:
				System.out.println("圓柱體的體積為："+c.calculate_the_volume());
				break;
			case 3:
				c.show_all_information();
				break;
		}
	}
}
class cylinder {
	private int radius, high;
	public void set_radius(int num) {
		radius = num;
	}
	public void set_high(int num) {
		high = num;
	}
	public int get_radius() {
		return radius;
	}
	public int get_high() {
		return high;
	}
	public double surface_area() {
		return 3.14*radius*radius*2 + 2*3.14*radius*high;
	}
	public double calculate_the_volume() {
		return 3.14*radius*radius*high;
	}
	public void show_all_information() {
		System.out.println("圓柱體的表面積為："+surface_area()+"，體積為："+calculate_the_volume());
	}
}
