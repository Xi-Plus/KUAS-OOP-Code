import java.io.*;
import java.util.*;

public class w14_hw02_hw57 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		Management company = new Management();
		while (true) {
			System.out.print("1. Basic_Employee 2. managers 3. supervisors 4. exit : ");
			int type = Integer.parseInt(buf.readLine());
			if (type == 4) {
				break;
			}
			System.out.print("請輸入姓名：");
			String name = buf.readLine();
			System.out.print("請輸入性別：");
			String sex = buf.readLine();
			System.out.print("請輸入電話：");
			String phone = buf.readLine();
			System.out.print("請輸入地址：");
			String address = buf.readLine();
			System.out.print("請輸入年資：");
			int year = Integer.parseInt(buf.readLine());
			company.addperson(type, name, sex, phone, address, year);
		}
		System.out.println("總人事成本為"+company.calccost());
	}
}
