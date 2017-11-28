import java.io.*;
import java.util.*;
class w12_exam3{
	private static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] argv) throws IOException {
		System.out.print("請輸入姓名：");
		String name = buf.readLine();
		System.out.print("請輸入性別（男/女）：");
		String gender = buf.readLine();
		String cls = "";
		while(true) {
			System.out.print("請輸入就讀系所（資工系/資管系/電子系）：");
			cls = buf.readLine();
			if (!cls.equals("資工系") && !cls.equals("資管系") && !cls.equals("電子系")) {
				System.out.println("輸入錯誤，請重新輸入");
			} else {
				break;
			}
		}
		String id = "";
		Date D = new Date();
		int year = D.getYear()-11;
		id += year;
		if (cls.equals("資工系")) {
			id += "001";
		} else if (cls.equals("資管系")) {
			id += "002";
		} else {
			id += "003";
		}
		if (gender.equals("男")) {
			id += "1";
		} else {
			id += "0";
		}
		id += "1";
		System.out.println("姓名："+name+"，性別："+gender+"，就讀"+cls+"，學號為"+id);
	}
}
