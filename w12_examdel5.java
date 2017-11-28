import java.io.*;
import java.util.*;
class w12_examdel5{
	private static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] argv) throws IOException {
		String ans = "";
		for (int q=0; q<10; q++) {
			ans += (int)(Math.random()*10);
		}
		System.out.println("本期發票中獎號碼為："+ans);
		String user = "";
		while (true) {
			System.out.print("請輸入發票號碼：");
			user = buf.readLine();
			if (user.length() == 10) {
				break;
			}
			System.out.println("輸入錯誤，請重新輸入");
		}
		int same = 0;
		for (int q=9; q>=0; q--) {
			if (user.charAt(q) == ans.charAt(q)) {
				same++;
			} else {
				break;
			}
		}
		if (same == 10) {
			System.out.println("恭喜你中了大獎，獎金為新台幣 100 元");
		} else if (same >= 7) {
			System.out.println("恭喜你中了二獎，獎金為新台幣 50 元");
		} else if (same >= 5) {
			System.out.println("恭喜你中了三獎，獎金為新台幣 10 元");
		} else if (same >= 3) {
			System.out.println("恭喜你中了四獎，獎金為新台幣 1 元");
		} else {
			System.out.println("沒有中獎");
		}
	}
}
