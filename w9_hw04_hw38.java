import java.io.*;

class w9_hw04_hw38 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		Student stu = new Student();
		System.out.print("請輸入姓名:");
		stu.set_name(buf.readLine());

		System.out.print("請輸入平時成績:");
		while (!stu.set_usual_score(Integer.parseInt(buf.readLine()))) {
			System.out.println("成績不在0~100之內，請重新輸入");
			System.out.print("請輸入平時成績:");
		}

		System.out.print("謮輸入期中考成績:");
		while (!stu.set_mid_scoref(Integer.parseInt(buf.readLine()))) {
			System.out.println("成績不在0~100之內，請重新輸入");
			System.out.print("謮輸入期中考成績:");
		}

		System.out.print("請輸入期末考成績:");
		while (!stu.set_inal_score(Integer.parseInt(buf.readLine()))) {
			System.out.println("成績不在0~100之內，請重新輸入");
			System.out.print("請輸入期末考成績:");
		}
		System.out.println("學生:"+stu.get_name());
		System.out.println("平時成績:"+stu.get_usual_score());
		System.out.println("期中考成績:"+stu.get_mid_scoref());
		System.out.println("期末考成績:"+stu.get_inal_score());
		System.out.println("期末總成績:"+(stu.get_usual_score()*0.3 + stu.get_mid_scoref()*0.3 + stu.get_inal_score()*0.4));
	}
}
class Student {
	String name;
	int usual_score, mid_scoref, inal_score;
	public void set_name(String nname) {
		name = nname;
	}
	public boolean set_usual_score(int num) {
		if (num < 0 || num > 100) {
			return false;
		}
		usual_score = num;
		return true;
	}
	public boolean set_mid_scoref(int num) {
		if (num < 0 || num > 100) {
			return false;
		}
		mid_scoref = num;
		return true;
	}
	public boolean set_inal_score(int num) {
		if (num < 0 || num > 100) {
			return false;
		}
		inal_score = num;
		return true;
	}
	public String get_name() {
		return name;
	}
	public int get_usual_score() {
		return usual_score;
	}
	public int get_mid_scoref() {
		return mid_scoref;
	}
	public int get_inal_score() {
		return inal_score;
	}
}
