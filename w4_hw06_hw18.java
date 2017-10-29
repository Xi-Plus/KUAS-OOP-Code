import java.io.*;
public class hw18{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int action = 0, diff, money = 0;
		while (action != 4) {
			System.out.print("請選擇功能（1.提款、2.存款、3.查詢餘額、4.離開）：");
			action = Integer.parseInt(reader.readLine());
			switch (action) {
				case 1:
					System.out.print("輸入提款金額：");
					try {
						diff = Integer.parseInt(reader.readLine());
					} catch(Exception e) {
						System.out.println("操作金額超過上限");
						break;
					}
					if (diff > money) {
						System.out.println("金額不足，目前餘額："+money);
					} else {
						money -= diff;
						System.out.println("提款成功，目前餘額："+money);
					}
					break;
				case 2:
					System.out.print("請輸入存款金額：");
					try {
						diff = Integer.parseInt(reader.readLine());
					} catch(Exception e) {
						System.out.println("操作金額超過上限");
						break;
					}
					if ((long)money + diff > 2147483647) {
						System.out.println("總金額超過上限");
					} else {
						money += diff;
						System.out.println("存款成功，目前餘額："+money);
					}
					break;
				case 3:
					System.out.println("目前餘額："+money);
					break;
				case 4:
					System.out.println("感謝您的使用，歡迎下次的光臨。");
					break;
				default:
					System.out.println("輸入錯誤，沒有此功能，請重新輸入。");
					break;
			}
		}
	}
}
