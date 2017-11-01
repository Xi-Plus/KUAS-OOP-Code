import java.io.*;

public class w7_hw02_hw26 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("請輸入變形費氏數列的第幾項：");
		int n = Integer.parseInt(buf.readLine());
		System.out.println("第"+n+"項費氏數列的值為："+f(n));
	}
	public static int f(int n) {
		if (n == 1) {
			return 5;
		} else if (n == 2) {
			return 6;
		} else {
			return f(n-1)+f(n-2);
		}
	}
}
