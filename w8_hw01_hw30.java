import java.io.*;
import java.util.Arrays;

public class hw30 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("請輸入第 1 個數值：");
		int a = Integer.parseInt(buf.readLine());
		System.out.print("請問是否有第 2 個數值要輸入?(y/n)：");
		if (buf.readLine().charAt(0) == 'y') {
			System.out.print("請輸入第 2 個數值：");
			int b = Integer.parseInt(buf.readLine());
			System.out.print("請問是否有第 3 個數值要輸入?(y/n)：");
			if (buf.readLine().charAt(0) == 'y') {
				System.out.print("請輸入第 3 個數值：");
				int c = Integer.parseInt(buf.readLine());
				calArea(a, b, c);
			} else {
				calArea(a, b);
			}
		} else {
			calArea(a);
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
