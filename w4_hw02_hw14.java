import java.io.*;
public class hw14{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int min, max, base;
		System.out.print("請輸入範圍的最小數：");
		min = Integer.parseInt(reader.readLine());
		System.out.print("請輸入範圍的最大數：");
		max = Integer.parseInt(reader.readLine());
		System.out.print("請輸入要尋找的倍數的基值：");
		base = Integer.parseInt(reader.readLine());
		System.out.print(base+" 的倍數為：");
		for (; min <= max; min++) {
			if (min % base == 0) {
				System.out.print(" "+min);
			}
		}
	}
}
