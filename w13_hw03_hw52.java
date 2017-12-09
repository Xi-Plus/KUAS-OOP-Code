import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class w13_hw03_hw52 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		Game_account acct[] = new Game_account[5];
		acct[0] = new Game_account("example", "example");
		acct[1] = new Game_account("test", "test");

		String account = "";
		while (true) {
			System.out.print("請輸入帳號：");
			account = buf.readLine();
			boolean same = false;
			for (int q=0; q<Game_account.get_KeyID(); q++) {
				if (account.equals(acct[q].get_account())) {
					same = true;
					break;
				}
			}
			if (same) {
				System.out.println("帳號已被使用，請重新輸入");
			} else {
				break;
			}
		}
		String pwd1 = "", pwd2 = "";
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
		acct[Game_account.get_KeyID()] = new Game_account(account, pwd1);
		acct[Game_account.get_KeyID()-1].showProfile();
	}
}
class Game_account {
	private static int KeyID = 0;
	private int UID;
	private final String account;
	private String password;
	private final String date;

	Game_account(String account,String password) {
		this(account, password, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
	Game_account(String account, String password, String date) {
		this.KeyID++;
		this.UID = this.KeyID;
		this.account = account;
		this.set_password(password);
		this.date = date;
	}
	public void set_password(String password) {
		this.password = password;
	}
	public String get_account() {
		return this.account;
	}
	public String get_password() {
		return this.password;
	}
	public static int get_KeyID() {
		return KeyID;
	}
	public int get_UID() {
		return this.UID;
	}
	public String getDate() {
		return this.date;
	}
	public void showProfile() {
		System.out.println("UID為"+this.get_UID()+" 帳號為"+this.get_account()+" 密碼為"+this.get_password()+" 建立日期為"+this.getDate());
	}
}
