package game.admin;
import java.io.*;
import game.Game_account;

public class admin_account extends Game_account {
	private String admin_name, admin_email;
	private int admin_ID;

	public admin_account(String account, String password, String admin_name, String admin_email, int admin_ID) {
		super(account, password);
		this.set_name(admin_name);
		this.set_email(admin_email);
		this.set_ID(admin_ID);
	}
	public void set_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public void set_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public void set_ID(int admin_ID) {
		this.admin_ID = admin_ID;
	}
	public String get_name() {
		return this.admin_name;
	}
	public String get_email() {
		return this.admin_email;
	}
	public int get_ID() {
		return this.admin_ID;
	}
	public void showProfile() {
		super.showProfile();
		System.out.println("姓名為"+this.get_name()+" 信箱為"+this.get_email()+" ID為"+this.get_ID());
	}
}
