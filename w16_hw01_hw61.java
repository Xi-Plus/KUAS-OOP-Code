import java.io.*;

class w16_hw01_hw61 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		String name, sex;
		int year;

		System.out.print("請輸入姓名：");
		name = buf.readLine();

		System.out.print("請輸入性別：");
		sex = buf.readLine();

		System.out.print("請輸入年齡：");
		try {
			year = Integer.parseInt(buf.readLine());
		} catch(NumberFormatException e) {
			e.printStackTrace();
			year = -1;
		}
		System.out.println("姓名為"+name);
		System.out.println("性別為"+sex);
		if (year == -1) {
			System.out.println("年齡輸入時發生錯誤");
		} else {
			System.out.println("年齡為"+year);
		}
	}
}
