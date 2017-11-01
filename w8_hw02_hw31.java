import java.io.*;

public class w8_hw02_hw31 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("請輸入數值：");
		String a[] = buf.readLine().split(",");
		if (a.length == 1) {
			calArea(Integer.parseInt(a[0]));
		} else if (a.length == 2) {
			calArea(Integer.parseInt(a[0]), Integer.parseInt(a[1]));
		} else {
			calArea(Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
		}
	}
	public static void calArea(int r) {
		System.out.println("這是一個圓形，面積為："+(r*r*3.14));
	}
	public static void calArea(int a, int b) {
		System.out.println("這是一個矩形，面積為："+(a*b));
	}
	public static void calArea(int a, int b, int c) {
		int v[] = {a, b, c};
		Arrays.sort(v);
		if (v[0]*v[0] + v[1]*v[1] == v[2]*v[2]) {
			System.out.println("這是一個三角形，面積為："+(v[0]*v[1]/2.0));
		} else {
			System.out.println("很抱歉您輸入的不是直角三形，我無法幫你計算面積。");
		}
	}
}
