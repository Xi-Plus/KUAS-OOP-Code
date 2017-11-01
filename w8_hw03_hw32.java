import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class w8_hw03_hw32 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat df = new SimpleDateFormat("H：mm：ss");

		System.out.print("輸入要查詢的城市：");
		String city = buf.readLine();
		switch (city) {
			case "舊金山":
				df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
				System.out.println("舊金山現在時間："+df.format(new Date()));
				break;
			case "倫敦":
				df.setTimeZone(TimeZone.getTimeZone("Europe/London"));
				System.out.println("倫敦現在時間："+df.format(new Date()));
				break;
			case "巴黎":
				df.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
				System.out.println("巴黎現在時間："+df.format(new Date()));
				break;
			case "曼谷":
				df.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
				System.out.println("曼谷現在時間："+df.format(new Date()));
				break;
			case "台灣":
				df.setTimeZone(TimeZone.getTimeZone("Asia/Taipei"));
				System.out.println("台灣現在時間："+df.format(new Date()));
				break;
			case "東京":
				df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
				System.out.println("東京現在時間："+df.format(new Date()));
				break;
			case "雪梨":
				df.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
				System.out.println("雪梨現在時間："+df.format(new Date()));
				break;
			default:
				System.out.println("查無此城市");
				break;
		}
	}
}
