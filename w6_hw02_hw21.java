import java.io.*;

public class w6_hw02_hw21 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		int v[] = {153,198,211,286,384,426,999};
		String c[] = {"A 區", "C 區", "E 區", "F 區", "G 區", "H 區", "Z 區"};

		System.out.print("商品編號："+v[0]);
		for (int q=1; q<v.length; q++) {
			System.out.print(","+v[q]);
		}
		System.out.println();

		do {
			System.out.print("請輸入要查詢位置的商品編號：");
			int n = Integer.parseInt(buf.readLine());
			boolean notfound = true;
			for (int q=0; q<v.length; q++) {
				if (v[q] == n) {
					System.out.println("商品位置在 "+c[q]);
					notfound = false;
					break;
				}
			}
			if (notfound) {
				System.out.println("查無此編號");
			}
			System.out.print("請問是否繼續查詢?(Y/N)：");
		} while(buf.readLine().charAt(0) == 'Y');

		System.out.println("程式結束");
	}
}
