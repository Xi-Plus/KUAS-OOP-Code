import java.io.*;
public class w3_hw01_hw6{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s1,s2,s3,s4;
		System.out.print("請輸入你的姓名：");
		s1 = reader.readLine();
		System.out.print("請輸入你的性別：");
		s2 = reader.readLine();
		System.out.print("請輸入你的西元出生年份：");
		s3 = reader.readLine();
		System.out.print("請輸入你的出生地：");
		s4 = reader.readLine();
		System.out.println("姓名："+s1);
		System.out.println("性別："+s2);
		System.out.println("西元出生年份："+s3);
		System.out.println("出生地："+s4);
	}
}
