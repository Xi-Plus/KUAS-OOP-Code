import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class w9_hw05_hw39 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		account accts[] = new account[100];
		int acctcnt = 0;
		String acct, pwd, name;
		int m;

		while (true) {
			int acctno;
			while (true) {
				System.out.print("(1)登入 (2)申請帳號 (3)離開程式 ");
				int n = Integer.parseInt(buf.readLine());
				acctno = -1;
				switch(n) {
					case 1:
						System.out.print("請輸入帳號：");
						acct = buf.readLine();
						System.out.print("請輸入密碼：");
						pwd = buf.readLine();
						boolean find = false;
						for (int q=0; q<acctcnt; q++) {
							if (accts[q].get_account().equals(acct) && accts[q].get_password().equals(pwd)) {
								find = true;
								acctno = q;
							}
						}
						if (!find) {
							System.out.println("帳號或密碼錯誤");
							continue;
						} else {
							System.out.println("登入成功，歡迎"+accts[acctno].get_name());
							break;
						}
					case 2:
						while(true) {
							System.out.print("請輸入帳號：");
							acct = buf.readLine();
							if (!acct.matches("(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z]\\S{7,11}")) {
								System.out.println("帳號不符合8-12個字元的英數符號混合及首字英文");
								continue;
							}
							boolean dup = false;
							for (int q=0; q<acctcnt; q++) {
								if (accts[q].get_account().equals(acct)) {
									dup = true;
								}
							}
							if (dup) {
								System.out.println("帳號已被使用");
								continue;
							}
							break;
						}
						System.out.print("請輸入密碼：");
						pwd = buf.readLine();
						System.out.print("請輸入名稱：");
						name = buf.readLine();
						accts[acctcnt] = new account();
						accts[acctcnt].set_account(acct);
						accts[acctcnt].set_password(pwd);
						accts[acctcnt].set_name(name);
						accts[acctcnt].set_money(0);
						System.out.println("已建立帳號："+acct);
						acctcnt++;
						break;
					case 3:
						System.out.println("程式結束");
						return;
				}
				if (acctno != -1) {
					break;
				}
			}
			while (true) {
				System.out.print("(1)提款 (2)存款 (3)查詢餘額 (4)登出 ");
				int n = Integer.parseInt(buf.readLine());
				switch(n) {
					case 1:
						System.out.print("請輸入提款金額：");
						m = Integer.parseInt(buf.readLine());
						if (accts[acctno].get_money() < m) {
							System.out.println("餘額不足");
						} else {
							accts[acctno].set_money(accts[acctno].get_money() - m);
							System.out.println("成功提款"+m+"元，餘額"+accts[acctno].get_money()+"元");
						}
						break;
					case 2:
						System.out.print("請輸入存款金額：");
						m = Integer.parseInt(buf.readLine());
						accts[acctno].set_money(accts[acctno].get_money() + m);
						System.out.println("成功提款"+m+"元，餘額"+accts[acctno].get_money()+"元");
						break;
					case 3:
						System.out.println("餘額"+accts[acctno].get_money()+"元");
						break;
					case 4:
						System.out.println("再見");
						break;
				}
				if (n == 4) {
					break;
				}
			}
		}
	}
}
class account {
	private String name, account, password;
	private int money;
	public void set_name(String name) {
		this.name = name;
	}
	public String get_name() {
		return name;
	}
	public void set_account(String account) {
		this.account = account;
	}
	public String get_account() {
		return account;
	}
	public void set_password(String password) {
		this.password = password;
	}
	public String get_password() {
		return password;
	}
	public void set_money(int money) {
		this.money = money;
	}
	public int get_money() {
		return money;
	}
}
