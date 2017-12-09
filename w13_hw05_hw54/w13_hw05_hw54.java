import java.io.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import game.user.user_account;
import game.admin.admin_account;

public class w13_hw05_hw54 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String account = "", name = "", email = "";
		String pwd1 = "", pwd2 = "";
		Pattern p = Pattern.compile(".+@(kuas\\.edu\\.tw|gmail\\.com)");
		Matcher m;

		System.out.print("請輸入使用者帳號：");
		account = buf.readLine();
		while (true) {
			System.out.print("請輸入密碼：");
			pwd1 = buf.readLine();
			System.out.print("請再次輸入密碼：");
			pwd2 = buf.readLine();
			if (pwd1.equals(pwd2)) {
				break;
			} else {
				System.out.println("密碼不相同，請重新輸入");
			}
		}
		System.out.print("請輸入使用者姓名：");
		name = buf.readLine();
		while (true) {
			System.out.print("請輸入Email：");
			email = buf.readLine();
			m = p.matcher(email);
			if (m.matches()) {
				break;
			} else {
				System.out.println("Email格式錯誤");
			}
		}
		user_account user1 = new user_account(account, pwd1, name, email);
		user1.showProfile();




		System.out.print("請輸入使用者帳號：");
		account = buf.readLine();
		while (true) {
			System.out.print("請輸入密碼：");
			pwd1 = buf.readLine();
			System.out.print("請再次輸入密碼：");
			pwd2 = buf.readLine();
			if (pwd1.equals(pwd2)) {
				break;
			} else {
				System.out.println("密碼不相同，請重新輸入");
			}
		}
		System.out.print("請輸入使用者姓名：");
		name = buf.readLine();
		while (true) {
			System.out.print("請輸入Email：");
			email = buf.readLine();
			m = p.matcher(email);
			if (m.matches()) {
				break;
			} else {
				System.out.println("Email格式錯誤");
			}
		}
		user_account user2 = new user_account(account, pwd1, name, email);
		user2.showProfile();

		System.out.print("請輸入管理員帳號：");
		account = buf.readLine();
		while (true) {
			System.out.print("請輸入密碼：");
			pwd1 = buf.readLine();
			System.out.print("請再次輸入密碼：");
			pwd2 = buf.readLine();
			if (pwd1.equals(pwd2)) {
				break;
			} else {
				System.out.println("密碼不相同，請重新輸入");
			}
		}
		System.out.print("請輸入管理員姓名：");
		name = buf.readLine();
		while (true) {
			System.out.print("請輸入Email：");
			email = buf.readLine();
			m = p.matcher(email);
			if (m.matches()) {
				break;
			} else {
				System.out.println("Email格式錯誤");
			}
		}
		System.out.print("請輸入管理員ID：");
		int id = Integer.parseInt(buf.readLine());
		admin_account admin = new admin_account(account, pwd1, name, email, id);
		admin.showProfile();
	}
}
