import java.io.*;
import java.util.*;
class w12_exam1{
	private static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] argv) throws IOException {
		System.out.print("請輸入姓名：");
		String name = buf.readLine();
		System.out.print("請輸入出生年月日：");
		String birthday[] = buf.readLine().split("/");
		int by = Integer.parseInt(birthday[0]),
			bm = Integer.parseInt(birthday[1]),
			bd = Integer.parseInt(birthday[2]);
		System.out.print("請輸入性別(M/F)：");
		String gender = buf.readLine();
		Date D = new Date();
		int year = D.getYear()-11;
		int month = D.getMonth()+1;
		int date = D.getDate();
		int age = year-Integer.parseInt(birthday[0]);
		if (bm > month || (bm == month && bd > date)) {
			age -= 1;
		}
		List<String> check = new LinkedList<>();
		if (gender.equals("M")) {
			if (age >= 20) {
				check.add("膽固醇檢測");
			}
			if (age >= 50) {
				check.add("攝護腺癌檢測");
			}
		} else {
			if (age >= 18) {
				check.add("子宮頸抹片檢查");
			}
			if (age >= 30) {
				check.add("乳房超音波檢查");
			}
			if (age >= 40) {
				check.add("乳房超音波檢查或乳房X光檢查");
			}
		}
		if (age >= 65) {
			check.add("骨質密度檢測");
		}
		System.out.println(name+(gender.equals("M")?"先生":"小姐")+"，年齡"+age+"歲，建議進行以下健康檢查："+String.join("、", check));
	}
}
