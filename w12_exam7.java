import java.io.*;
import java.util.*;
class w12_exam7{
	private static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] argv) throws IOException {
		int money = 0;
		System.out.print("請輸入本金：");
		while (true) {
			money = Integer.parseInt(buf.readLine());
			if (money >= 100) {
				break;
			}
			System.out.print("單次100，請重新投入本金：");
		}
		String item = "+-*/!@#$%=";
		while (true) {
			if (money < 100) {
				System.out.println("輸到脫褲啦!!");
				break;
			}
			System.out.print("是否開始遊戲(Y/N)？：");
			if (buf.readLine().charAt(0) == 'N') {
				System.out.println("遊戲結束");
				break;
			}
			money -= 100;
			int last = -1, nown = 0, max = -1, maxn = -1;
			for (int q=0; q<5; q++) {
				int x = (int)(Math.random()*10);
				System.out.print(item.charAt(x));
				if (x == last) {
					nown++;
					if (nown > maxn) {
						max = last;
						maxn = nown;
					}
				} else {
					last = x;
					nown = 1;
				}
			}
			System.out.println();
			if (maxn == 5) {
				System.out.println("恭喜你贏了300元");
				money += 300;
			} else if (maxn >= 3) {
				System.out.println("恭喜你贏了150元");
				money += 150;
			} else if (maxn == 2) {
				System.out.println("恭喜你贏了130元");
				money += 130;
			} else {
				System.out.println("沒有中獎");
			}
			System.out.println("目前本金："+money+"元");
		}
	}
}
