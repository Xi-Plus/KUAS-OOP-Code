import java.io.*;
import java.util.*;
class w12_exam6{
	private static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] argv) throws IOException {
		System.out.print("請輸入日期：");
		String days[] = buf.readLine().split("/");
		if (days.length == 1) {
			echo(Integer.parseInt(days[0]));
		} else {
			echo(Integer.parseInt(days[0]), Integer.parseInt(days[1]));
		}
	}
	public static void echo(int month) {
		System.out.println(month+"月的月曆");
		for (int q=1; q<=7; q++) {
			System.out.print("星期"+q+"\t");
		}
		System.out.println();
		int firstday = new Date("2018/"+month+"/1").getDay();
		if (firstday == 0) {
			firstday = 7;
		}
		int days[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int q=1; q<firstday; q++) {
			System.out.print("\t");
		}
		for (int q=1; q<=days[month-1]; q++) {
			System.out.print(q+"\t");
			if ((q+firstday-1) % 7 == 0) {
				System.out.println();
			}
		}
		int lastday = new Date("2018/"+month+"/"+days[month-1]).getDay();
		if (lastday != 0) {
			System.out.println();
		}
	}
	public static void echo(int month, int date) {
		String days[] = new String[]{"日", "一", "二", "三", "四", "五", "六"};
		int day = new Date("2018/"+month+"/"+date).getDay();
		System.out.println(month+"月"+date+"日是禮拜"+days[day]);
	}
}
