import java.io.*;

class w9_hw02_hw36 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		circle c = new circle();
		System.out.print("請輸入半徑：");
		c.set_radius(Integer.parseInt(buf.readLine()));

		System.out.println("此圓半徑為 "+c.get_radius()+"，面積為 "+c.get_area()+"，周長為 "+c.get_perimeter());
	}
}
class circle {
	private int r;
	void set_radius(int num) {
		r = num;
	}
	public int get_radius() {
		return r;
	}
	public double get_area() {
		return 3.14*r*r;
	}
	public double get_perimeter() {
		return 2*3.14*r;
	}
}
