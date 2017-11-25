import java.io.*;

class w11_hw01_hw45 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("請輸入車子的品牌：");
		String Brand;
		Brand = buf.readLine();
		System.out.print("請輸入車子的種類：");
		String Vehicles;
		Vehicles = buf.readLine();
		System.out.print("請輸入車子的最大時速：");
		int kmh;
		kmh = Integer.parseInt(buf.readLine());
		System.out.print("請輸入車子的最大轉速：");
		int rpm;
		rpm = Integer.parseInt(buf.readLine());

		Sports_car scar = new Sports_car(Brand, Vehicles);
		scar.set_kmh(kmh);
		scar.set_rpm(rpm);

		scar.show();
	}
}
class car {
	private String Brand, Vehicles;
	car() {
		this("", "");
	}
	car(String Brand, String Vehicles) {
		set_Brand(Brand);
		set_Vehicles(Vehicles);
	}
	public void set_Brand(String Brand) {
		this.Brand = Brand;
	}
	public void set_Vehicles(String Vehicles) {
		this.Vehicles = Vehicles;
	}
	public String get_Brand() {
		return Brand;
	}
	public String get_Vehicles() {
		return Vehicles;
	}
	public void show() {
		System.out.print(Brand+" "+Vehicles);
	}
}

class Sports_car extends car {
	private int kmh, rpm;
	Sports_car() {
		this("", "");
	}
	Sports_car(String Brand, String Vehicles) {
		super(Brand, Vehicles);
	}
	public void set_kmh(int kmh) {
		this.kmh = kmh;
	}
	public void set_rpm(int rpm) {
		this.rpm = rpm;
	}
	public int get_kmh(int kmh) {
		return kmh;
	}
	public int get_rpm(int rpm) {
		return rpm;
	}
	public void show() {
		super.show();
		System.out.println("，最大時速為 "+kmh+"，最大轉速為 "+rpm);
	}
}
