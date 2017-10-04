import java.io.*;
public class w3_hw07_hw12{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int attack, damage;
		double buff;
		System.out.print("輸入攻擊數值：");
		attack = Integer.parseInt(reader.readLine());
		System.out.print("輸入增益值：");
		buff = Double.parseDouble(reader.readLine());
		damage = (int)(attack * buff);
		System.out.println("增益造成傷害值："+damage);
		if (damage == 2147483647 && (attack != 1 && buff != 1)) {
			System.out.println("增益運算結果：「overflow」");
		} else if (damage == 0) {
			System.out.println("增益運算結果：「underflow」");
		} else {
			System.out.println("增益運算結果：「正常」");
		}
	}
}
