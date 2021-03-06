import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class w8_hw05_hw34 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String accts[] = new String[5];
		accts[0] = "Example123+";
		accts[1] = "Testtest1+";

		String acct;
		while(true) {
			System.out.print("請輸入帳號：");
			acct = buf.readLine();
			if (!acct.matches("(?=.*[A-Za-z])(?=.*[0-9])(?=.*[^A-Za-z0-9])[A-Z]\\S{7,11}")) {
				System.out.println("帳號不符合8-12個字元的英數符號混合");
			} else if (Arrays.asList(accts).contains(acct)) {
				System.out.println("帳號已被使用");
			} else {
				break;
			}
		}

		String pwd, pwd2;
		while (true) {
			while (true) {
				System.out.print("請輸入密碼：");
				pwd = buf.readLine();
				if (!pwd.matches("(?=.*[A-Za-z])(?=.*[0-9])(?=.*[^A-Za-z0-9])\\S{8,12}")) {
					System.out.println("密碼不符合8-12個字元的英數符號混合");
				} else if (acct.equals(pwd)) {
					System.out.println("密碼不可與帳號相同");
				} else {
					break;
				}
			}
			System.out.print("請再次輸入密碼：");
			pwd2 = buf.readLine();
			if (pwd.equals(pwd2)) {
				break;
			} else {
				System.out.print("密碼不相符");
			}
		}

		String email;
		Pattern p = Pattern.compile(".+@([^\\.]+).*");
		Matcher m;
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

		SimpleDateFormat df = new SimpleDateFormat("YYYY/MM/dd hh:mm:ss");

		System.out.println(acct+" 你好，歡迎來自 "+m.group(1)+" 的你，你的註冊時間是 "+df.format(new Date()));
	}
}
