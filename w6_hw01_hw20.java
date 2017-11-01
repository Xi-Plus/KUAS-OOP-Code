import java.io.*;

public class w6_hw01_hw20 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("輸入學生人數：");
		int n = Integer.parseInt(buf.readLine());
		int v[] = new int[n];
		System.out.println("---------------------------------------------");
		System.out.println("開始輸入學生成績");

		for (int q=0; q<n; q++) {
			System.out.print("請輸入第"+(q+1)+"位學生成績：");
			v[q] = Integer.parseInt(buf.readLine());
		}
		int min = v[0], max = v[0], pass = (v[0] >= 60 ? 1 : 0);
		for (int q=1; q<n; q++) {
			if (v[q] < min) {
				min = v[q];
			}
			if (v[q] > max) {
				max = v[q];
			}
			if (v[q] >= 60) {
				pass++;
			}
		}
		
		System.out.println("成績統計結果如下：");
		System.out.println("共有"+n+"位學生，"+(n-pass)+"人不及格，"+pass+"人及格，最高分為"+max+"，最低分為"+min);
	}
}
