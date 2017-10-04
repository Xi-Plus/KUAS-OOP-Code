import java.io.*;
public class w3_hw05_hw10{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int second;
		System.out.print("請輸入秒數 : ");
		second = Integer.parseInt(reader.readLine());
		System.out.print("一共經過了 :");
		if (second / 86400 > 0) {
			System.out.print(" "+second/86400+" 天");
		}
		second %= 86400;
		if (second / 3600 > 0) {
			System.out.print(" "+second/3600+" 小時");
		}
		second %= 3600;
		if (second / 60 > 0) {
			System.out.print(" "+second/60+" 分鐘");
		}
		second %= 60;
		if (second > 0) {
			System.out.print(" "+second+" 秒");
		}
	}
}
