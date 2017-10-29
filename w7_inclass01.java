import java.io.*;

public class w7_inclass01 {
	public static void main(String[] args)throws IOException{
		int num_long , num_short;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//輸入長邊與短邊
		System.out.print("請輸入長邊：");
		num_long = Integer.parseInt(buf.readLine());
		System.out.print("請輸入短邊：");
		num_short = Integer.parseInt(buf.readLine());
		//顯示矩形周長
		System.out.print("矩形周長為：" + perimeter(num_short, num_long));
	}
	static int perimeter(int length1,int length2)
	{
		return 2*(length1 + length2);
	}
}