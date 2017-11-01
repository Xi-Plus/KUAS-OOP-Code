public class w7_hw01_hw25 {
	public static void main(String[] args) {
		System.out.println("圓形面積為："+circle(2.5));
		System.out.println("正方形面積為："+square(8));
		System.out.println("三角形面積為："+rectangle(4, 8));
		System.out.println("梯形面積為："+trapezium(5, 6, 2));
	}
	public static double circle(double r) {
		return r*r*3.14;
	}
	public static double square(double a) {
		return a*a;
	}
	public static double rectangle(double a, double b) {
		return a*b;
	}
	public static double trapezium(double a, double b, double h) {
		return (a+b)*h/2;
	}
}
/*
import java.io.*;

public class w7_hw01_hw25 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("輸入運算面積的類型代號 (0:圓形 1:三角形 2:矩形 3:梯形)：");
		int n = -1;
		double a, b, c;
		while(n == -1) {
			try {
				n = Integer.parseInt(buf.readLine());
			} catch (Exception e) {
				n = -1;
			}
			switch (n) {
				case 0:
					System.out.print("輸入半徑 :");
					a = Double.parseDouble(buf.readLine());
					System.out.println("圓形面積為："+circle(a));
					break;
				case 1:
					System.out.print("第 1 個邊長 :");
					a = Double.parseDouble(buf.readLine());
					System.out.print("第 2 個邊長 :");
					b = Double.parseDouble(buf.readLine());
					System.out.print("第 3 個邊長 :");
					c = Double.parseDouble(buf.readLine());
					System.out.println("三角形面積為："+triangle(a, b, c));
					break;
				case 2:
					System.out.print("輸入邊長 a：");
					a = Double.parseDouble(buf.readLine());
					System.out.print("輸入邊長 b：");
					b = Double.parseDouble(buf.readLine());
					System.out.println("矩形面積為："+square(a, b));
					break;
				case 3:
					System.out.print("輸入上底：");
					a = Double.parseDouble(buf.readLine());
					System.out.print("輸入下底：");
					b = Double.parseDouble(buf.readLine());
					System.out.print("輸入高：");
					c = Double.parseDouble(buf.readLine());
					System.out.println("梯形面積為："+trapezium(a, b, c));
					break;
				default:
					n = -1;
					System.out.println("輸入錯誤！請重新輸入 ");
					break;
			}
		}
	}
	public static double circle(double r) {
		return r*r*3.14;
	}
	public static double triangle(double a, double b, double c) {
		double s = (a+b+c) / 2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public static double square(double a, double b) {
		return a*b;
	}
	public static double trapezium(double a, double b, double h) {
		return (a+b)*h/2;
	}
}
*/
