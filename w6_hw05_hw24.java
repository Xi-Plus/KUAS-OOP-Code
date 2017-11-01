import java.io.*;

public class w6_hw05_hw24 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		boolean card[][] = new boolean[4][13];
		String cardnum[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String cardcat[] = {"桃花", "方塊", "梅花", "愛心"};
		double point[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0.5, 0.5, 0.5};
		double userpoint = 0, userfirstpoint;
		int x;

		x = (int)(Math.random()*52);
		card[x/13][x%13] = true;
		userfirstpoint = point[x%13];
		userpoint += point[x%13];
		System.out.println("抽到:"+cardcat[x/13]+" "+(x%13+1)+" ，你的點數: "+userpoint);

		while(true) {
			System.out.print("加牌請輸入1，不加牌請輸入0: ");
			if (Integer.parseInt(buf.readLine()) == 0) {
				break;
			}
			x = (int)(Math.random()*52);
			while(card[x/13][x%13]) {
				x = (int)(Math.random()*52);
			}
			card[x/13][x%13] = true;
			userpoint += point[x%13];
			System.out.println("抽到: "+cardcat[x/13]+" "+(x%13+1)+"，你的點數: "+userpoint);
			if (userpoint > 10.5) {
				System.out.println("玩家點數爆掉，電腦獲勝");
				break;
			}
		}
		double pcpoint = 0;
		if (userpoint <= 10.5) {
			while(pcpoint <= 7 && pcpoint <= userpoint-userfirstpoint) {
				x = (int)(Math.random()*52);
				while(card[x/13][x%13]) {
					x = (int)(Math.random()*52);
				}
				card[x/13][x%13] = true;
				pcpoint += point[x%13];
				System.out.println("電腦抽到: "+cardcat[x/13]+" "+(x%13+1)+"，電腦的點數: "+pcpoint);
				if (pcpoint > 10.5) {
					System.out.println("電腦點數爆掉，玩家獲勝");
					break;
				}
			}
		}
		if (userpoint <= 10.5 && pcpoint <= 10.5) {
			if (userpoint == pcpoint) {
				System.out.println("點數相同，電腦獲勝");
			} else if (userpoint > pcpoint) {
				System.out.println("玩家獲勝");
			} else {
				System.out.println("電腦獲勝");
			}
		}
	}
}
