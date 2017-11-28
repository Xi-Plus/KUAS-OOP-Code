import java.io.*;
import java.util.*;
class w12_exam2{
	private static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] argv) throws IOException {
		String citys[] = new String[]{"台北市", "基隆市", "台中市", "嘉義市", "花蓮市", "高雄市", "金門市"};
		int aqi[] = new int[]{75, 75, 105, 150, 50, 145, 100};
		int rain[] = new int[]{58, 42, 0, 0, 78, 30, 0};
		String city = "";
		int index = -1;
		while (index == -1) {
			System.out.print("請輸入想要查詢的城市名稱：");
			city = buf.readLine();
			for (int q=0; q<citys.length; q++) {
				if (citys[q].equals(city)) {
					index = q;
					break;
				}
			}
			if (index == -1) {
				System.out.print("查無此城市，請問是否要重新輸入(Y/N)：");
				if (buf.readLine().charAt(0) == 'N') {
					index = -2;
				}
			}
		}
		if (index == -2) {
			System.out.println("程式結束");
		} else {
			String type;
			if (aqi[index] <= 50) type = "良好";
			else if (aqi[index] <= 100) type = "普通";
			else if (aqi[index] <= 150) type = "對敏感族群不健康";
			else if (aqi[index] <= 200) type = "對所有族群不健康";
			else if (aqi[index] <= 300) type = "非常不健康";
			else type = "危害";
			String type2;
			if (aqi[index] <= 100) type2 = "無需戴口罩";
			else if (aqi[index] <= 150) type2 = "敏感族群需要戴口罩";
			else type2 = "請攜帶口罩";
			String type3;
			if (rain[index] <= 30) type3 = "無須帶傘出門";
			else if (rain[index] <= 70) type3 = "建議帶傘出門";
			else type3 = "請帶傘出門";
			System.out.println(city+"的空氣品質"+type+"，"+type2+"，降雨機率為 "+rain[index]+"% "+type3);
		}
	}
}
