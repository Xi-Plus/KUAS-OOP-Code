import java.io.*;
public class w3_hw02_hw7{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int mooncake,price,cash;
		System.out.print("月餅單價為：");
		mooncake = Integer.parseInt(reader.readLine());
		System.out.print("請輸入欲購買的月餅數量：");
		price = Integer.parseInt(reader.readLine());
		System.out.print("請輸入付款金額：");
		cash = Integer.parseInt(reader.readLine());
		if (mooncake*price > cash) {
			System.out.println("付款金額不足");
		} else {
			System.out.println("實付金額："+cash+"，應付金額："+mooncake*price+"，找零："+(cash-mooncake*price));
		}
	}
}
