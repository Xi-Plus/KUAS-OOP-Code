import java.io.*;

public class w6_inclass01 {
	public static void main(String[] args) throws IOException {
		int array_size;
		String str;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		//讀取使用者輸入的數字並用於宣告陣列的大小
		System.out.print("請輸入陣列大小(正整數)：");
		str = buf.readLine();
		array_size = Integer.parseInt(str);
		
		int v[] = new int[array_size];
		//顯示陣列的長度
		System.out.println(v.length);

	}
}
