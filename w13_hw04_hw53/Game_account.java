package game;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Game_account {
	private static int KeyID = 0;
	private int UID;
	private final String account;
	private String password;
	private final String date;

	public Game_account(String account,String password) {
		this(account, password, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
	public Game_account(String account, String password, String date) {
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
