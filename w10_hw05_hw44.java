import java.io.*;

public class w10_hw05_hw44 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		Dog dog[] = new Dog[3];
		System.out.print("請輸入寵物數量：");
		int n = Integer.parseInt(buf.readLine());
		for (int q=1; q<=n; q++) {
			System.out.print("請輸入的 "+q+" 隻寵物名稱：");
			String name = buf.readLine();
			System.out.print("請輸入的 "+q+" 隻寵物品種：");
			String variety = buf.readLine();
			System.out.print("請輸入第 "+q+" 隻寵物年紀：");
			int age;
			try {
				age = Integer.parseInt(buf.readLine());
			} catch (Exception e) {
				age = 1;
			}
			dog[q-1] = new Dog(name, variety, age);
		}
		int act = 0;
		while (act != 4) {
			System.out.print("請選擇以下功能：1 顯示所有寵物資訊，2 顯示最年長寵物資訊，3 修改寵物資料，4 離開程式：");
			act = Integer.parseInt(buf.readLine());
			switch(act) {
				case 1:
					for (int q=1; q<=n; q++) {
						dog[q-1].showInformation();
					}
					break;
				case 2:
					int oldage = 0, oldid = -1;
					for (int q=0; q<n; q++) {
						if (dog[q].getAge() > oldage) {
							oldage = dog[q].getAge();
							oldid = q;
						}
					}
					System.out.println("最年長寵物為："+dog[oldid].getName()+" 品種："+dog[oldid].getVariety()+" 年紀："+dog[oldid].getAge());
					break;
				case 3:
					System.out.print("欲修改的寵物：");
					int dogid = Integer.parseInt(buf.readLine())-1;
					System.out.print("1：修改名稱，2：修改寵物品種，3：修改寵物年齡：");
					int modify = Integer.parseInt(buf.readLine());
					switch (modify) {
						case 1:
							System.out.print("原名稱："+dog[dogid].getName()+"，欲修改為：");
							dog[dogid].setName(buf.readLine());
							break;
						case 2:
							System.out.print("原品種："+dog[dogid].getVariety()+"，欲修改為：");
							dog[dogid].setVariety(buf.readLine());
							break;
						case 3:
							System.out.print("原年齡："+dog[dogid].getAge()+"，欲修改為：");
							dog[dogid].setAge(Integer.parseInt(buf.readLine()));
							break;
					}
					break;
				case 4:
					System.out.println("程式結束");
					break;
			}
		}
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
		this._setName(name);
		this._setVariety(variety);
		this._setAge(age);
	}
	public void setName(String name) {
		this._setName(name);
	}
	private void _setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setVariety(String variety) {
		this._setVariety(variety);
	}
	private void _setVariety(String variety) {
		String accept[] = new String[]{"哈士奇", "鬆獅", "柴犬", "臘腸犬", "吉娃娃", "博美犬", "貴賓犬", "牧羊犬", "藏敖", "柯基"};
		for (int q=0; q<accept.length; q++) {
			if (variety.equals(accept[q])) {
				this.variety = variety;
				return;
			}
		}
		this.variety = "混種犬";
	}
	public String getVariety() {
		return this.variety;
	}
	public void setAge(int age) {
		this._setAge(age);
	}
	private void _setAge(int age) {
		if (age >= 1) {
			this.age = age;
		} else {
			this.age = 1;
		}
	}
	public int getAge() {
		return this.age;
	}
	public void showInformation() {
		System.out.println("你的寵物為："+this.name+" 品種："+this.variety+" 年紀："+this.age);
	}
}
