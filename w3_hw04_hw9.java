import java.io.*;
public class w3_hw04_hw9{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int year;
		System.out.print("請輸入西元年份:");
		year = Integer.parseInt(reader.readLine());
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("西元"+year+"年是閏年");
		} else {
			System.out.println("西元"+year+"年不是閏年");
		}
	}
}
