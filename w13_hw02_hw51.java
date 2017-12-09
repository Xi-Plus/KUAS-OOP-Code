import java.io.*;

public class w13_hw02_hw51 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入帳號：");
		String account = buf.readLine();
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
		Game_account acct = new Game_account(account, pwd1);
		acct.showProfile();
	}
}
class Game_account {
	private static int KeyID = 0;
	private int UID;
	private String account, password;

	Game_account(String account,String password) {
		this.KeyID++;
		this.UID = this.KeyID;
		this.set_account(account);
		this.set_password(password);
	}
	public void set_account(String account) {
		this.account = account;
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
	public int get_KeyID() {
		return this.KeyID;
	}
	public int get_UID() {
		return this.UID;
	}
	public void showProfile() {
		System.out.println("UID為"+this.get_UID()+" 帳號為"+this.get_account()+" 密碼為"+this.get_password());
	}
}
