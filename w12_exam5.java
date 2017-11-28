import java.io.*;
import java.util.*;
class w12_exam5{
	private static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] argv) throws IOException {
		String name[] = new String[100];
		int gender[] = new int[100];
		String cls[] = new String[100];
		String id[] = new String[100];
		Date D = new Date();
		int year = D.getYear()-11;

		System.out.print("請輸入需要建立的資料總筆數：");
		int n = Integer.parseInt(buf.readLine());

		for (int q=0; q<n; q++) {
			System.out.print("請輸入姓名：");
			name[q] = buf.readLine();
			System.out.print("請輸入性別（男/女）：");
			gender[q] = (buf.readLine().equals("男")?1:0);
			cls[q] = "";
			while(true) {
				System.out.print("請輸入就讀系所（資工系/資管系/電子系）：");
				cls[q] = buf.readLine();
				if (!cls[q].equals("資工系") && !cls[q].equals("資管系") && !cls[q].equals("電子系")) {
					System.out.println("輸入錯誤，請重新輸入");
				} else {
					break;
				}
			}
			id[q] = "";
			id[q] += year;
			if (cls[q].equals("資工系")) {
				id[q] += "001";
			} else if (cls[q].equals("資管系")) {
				id[q] += "002";
			} else {
				id[q] += "003";
			}
			id[q] += gender[q];
			id[q] += (q+1);
		}

		while(true) {
			System.out.print("請問是否需要查詢資訊(Y/N)：");
			if (buf.readLine().charAt(0) == 'N') {
				break;
			}
			System.out.print("請輸入要查詢的項目(1.所有學生資訊 2.男女人數 3.系所人數)：");
			int act = Integer.parseInt(buf.readLine());
			switch (act) {
				case 1:
					echo(name, gender, cls, id, n);
					break;
				case 2:
					echo(gender, n);
					break;
				case 3:
					echo(cls, n);
					break;
			}
		}

		System.out.println("程式結束");
	}
	public static void echo(String name[], int gender[], String cls[], String id[], int n) {
		for (int q=0; q<n; q++) {
			System.out.println("姓名："+name[q]+"，性別："+(gender[q]==1?"男":"女")+"，就讀"+cls[q]+"，學號為"+id[q]);
		}
	}
	public static void echo(int gender[], int n) {
		int m = 0, f = 0;
		for (int q=0; q<n; q++) {
			if (gender[q] == 1) {
				m += 1;
			} else {
				f += 1;
			}
		}
		System.out.println("男生一共"+m+"人，女生一共"+f+"人");
	}
	public static void echo(String cls[], int n) {
		int cls1 = 0, cls2 = 0, cls3 = 0;
		for (int q=0; q<n; q++) {
			if (cls[q].equals("資工系")) {
				cls1 += 1;
			} else if (cls[q].equals("資管系")) {
				cls2 += 1;
			} else {
				cls3 += 1;
			}
		}
		System.out.println("資工系"+cls1+"人，資管系"+cls2+"人，電子系"+cls3+"人");
	}
}
