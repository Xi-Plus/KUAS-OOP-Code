import java.io.*;

class w11_hw03_hw47 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		Teacher tea = new Teacher();
		tea.set_IDcard("66666");
		tea.set_phone("987");
		tea.showProfile();
		tea.calcBMI();
	}
}

class Teacher extends Person {
	private String IDcard, phone;
	public void set_IDcard(String IDcard) {
		this.IDcard = IDcard;
	}
	public void set_phone(String phone) {
		this.phone = phone;
	}
	public String get_IDcard(String kmh) {
		return IDcard;
	}
	public String get_phone(String phone) {
		return phone;
	}
	public void showProfile() {
		super.showProfile();
		System.out.println("人事編號："+IDcard+" 分機號碼："+phone);
	}
	public void calcBMI() {
		double r = (double)getWeight() / (getHeight() * getHeight()) * 10000;
		String res = "";
		if (r < 18.5) {
			res = "體重過輕";
		} else if (r < 24) {
			res = "正常體重";
		} else if (r < 28) {
			res = "輕度肥胖";
		} else if (r < 32) {
			res = "中度肥胖";
		} else {
			res = "過度肥胖";
		}
		System.out.println(getName()+"老師，您的 BMI 值為："+r+" 屬於："+res+"。");
	}
}
