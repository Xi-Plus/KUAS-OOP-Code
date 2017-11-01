import java.io.*;
import java.util.*;

public class w8_hw04_hw33 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		List<Food> foodlist = new ArrayList<Food>();

		String dayname[] = {"日", "一", "二", "三", "四", "五", "六"};

		for (int q=0; q<7; q++) {
			System.out.print("輸入第"+(q+1)+"餐點名稱及價格（以空格隔開）：");
			String tmp[] = buf.readLine().split(" ");
			foodlist.add(new Food(tmp[0], Integer.parseInt(tmp[1])));
		}
		Collections.shuffle(foodlist);
		Food food[] = new Food[foodlist.size()];
		foodlist.toArray(food);

		Collections.sort(foodlist, new Comparator<Food>() {
			public int compare(Food a, Food b) {
				if (a.price < b.price) {
					return -1;
				} else if (a.price > b.price) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		int act = 0;
		while (act != 4) {
			System.out.print("\n請選擇功能(1.當天要吃什麼 2.價格排序 3.列出一周菜單 4.離開程式)：");
			act = Integer.parseInt(buf.readLine());
			switch (act) {
				case 1:
					int day = new Date().getDay();
					System.out.println("今天星期"+dayname[day]+"，我要吃"+food[day].name+"，價格 "+food[day].price+" 元");
					break;
				case 2:
					for (Food f:foodlist) {
						System.out.println(f.name+" "+f.price+"元");
					}
					break;
				case 3:
					for (int q=0; q<7; q++) {
						System.out.println("星期"+dayname[q]+" 吃"+food[q].name+" "+food[q].price+"元");
					}
					break;
				case 4:
					System.out.println("程式結束");
					break;
			}
		}
	}
	public static class Food {
		String name;
		int price;
		public Food(String n, int p) {
			name = n;
			price = p;
		}
	}
}
