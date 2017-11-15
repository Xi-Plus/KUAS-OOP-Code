import java.io.*;

class w9_hw01_hw35 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		RPGcharacter c = new RPGcharacter();
		System.out.print("請輸入姓名：");
		c.set_name(buf.readLine());
		System.out.print("請輸入等級：");
		c.set_level(buf.readLine());
		System.out.print("請輸入職業：");
		c.set_job(buf.readLine());
		System.out.print("請輸入技能：");
		c.set_skill(buf.readLine());

		c.showProfile();
	}
}
class RPGcharacter {
	private String name, level, job, skill;
	public void set_name(String newname) {
		name = newname;
	}
	public void set_level(String newlevel) {
		level = newlevel;
	}
	public void set_job(String newjob) {
		job = newjob;
	}
	public void set_skill(String newskill) {
		skill = newskill;
	}
	public void showProfile() {
		System.out.println("姓名："+name+"，等級："+level+"，職業："+job+"，技能："+skill);
	}
}
