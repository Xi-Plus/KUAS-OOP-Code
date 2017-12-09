package game.user;
import java.io.*;
import game.Game_account;

public class user_account extends Game_account {
	private String user_name, user_email;

	public user_account(String account, String password, String name, String email) {
		super(account, password);
		this.set_name(name);
		this.set_email(email);
	}
	public void set_name(String user_name) {
		this.user_name = user_name;
	}
	public void set_email(String user_email) {
		this.user_email = user_email;
	}
	public String get_name() {
		return this.user_name;
	}
	public String get_email() {
		return this.user_email;
	}
	public void showProfile() {
		super.showProfile();
		System.out.println("姓名為"+this.get_name()+" 信箱為"+this.get_email());
	}
}
