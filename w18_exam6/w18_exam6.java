import java.io.*;

public class w18_exam6 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("請輸入人物1名稱：");
		String name1 = buf.readLine();
		System.out.print("請輸入人物1階級（二兵,一兵,上兵,下士,中士,上士,三等長,二等長,一等長）：");
		String rank1 = buf.readLine();
		System.out.print("請輸入人物1軍種（陸軍,海軍,空軍）：");
		String type1 = buf.readLine();
		System.out.print("請輸入人物2名稱：");
		String name2 = buf.readLine();
		System.out.print("請輸入人物2階級（二兵,一兵,上兵,下士,中士,上士,三等長,二等長,一等長）：");
		String rank2 = buf.readLine();
		System.out.print("請輸入人物2軍種（陸軍,海軍,空軍）：");
		String type2 = buf.readLine();

		Person person1;
		switch (type1) {
			case "陸軍":
				person1 = new Land(name1, rank1);
				break;
			case "空軍":
				person1 = new Air(name1, rank1);
				break;
			case "海軍":
				person1 = new Sea(name1, rank1);
				break;
			default:
				person1 = new Person(name1, rank1);
				break;
		}
		Person person2;
		switch (type2) {
			case "陸軍":
				person2 = new Land(name2, rank2);
				break;
			case "空軍":
				person2 = new Air(name2, rank2);
				break;
			case "海軍":
				person2 = new Sea(name2, rank2);
				break;
			default:
				person2 = new Person(name2, rank2);
				break;
		}

		person1.hello(person2);
		person2.hello(person1);
	}
}
