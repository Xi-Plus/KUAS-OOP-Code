import java.io.*;

public class w10_hw03_hw42 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入寵物名稱：");
		String name = buf.readLine();
		System.out.print("請輸入寵物品種：");
		String variety = buf.readLine();
		System.out.print("請輸入寵物年紀：");
		int age;
		try {
			age = Integer.parseInt(buf.readLine());
		} catch (Exception e) {
			age = 1;
		}
		Dog dog = new Dog(name, variety, age);
		dog.showInformation();
	}
}
class Dog {
	private String name, variety;
	private int age;
	Dog() {
		this(null, "", 1);
	}
	Dog(String name)  {
		this(name, "", 1);
	}
	Dog(String name, String variety)  {
		this(name, variety, 1);
	}
	Dog(String name, String variety, int age) {
		this.setName(name);
		this.setVariety(variety);
		this.setAge(age);
	}
	private void setName(String name) {
		this.name = name;
	}
	private void setVariety(String variety) {
		String accept[] = new String[]{"哈士奇", "鬆獅", "柴犬", "臘腸犬", "吉娃娃", "博美犬", "貴賓犬", "牧羊犬", "藏敖", "柯基"};
		for (int q=0; q<accept.length; q++) {
			if (variety.equals(accept[q])) {
				this.variety = variety;
				return;
			}
		}
		this.variety = "混種犬";
	}
	private void setAge(int age) {
		if (age >= 1) {
			this.age = age;
		} else {
			this.age = 1;
		}
	}
	public void showInformation() {
		System.out.println("你的寵物為："+this.name+" 品種："+this.variety+" 年紀："+this.age);
	}
}
