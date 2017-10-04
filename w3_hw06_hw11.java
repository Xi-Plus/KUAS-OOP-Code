import java.io.*;
public class w3_hw06_hw11{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int score;
		System.out.print("請輸入 TOEIC 成績：");
		score = Integer.parseInt(reader.readLine());
		if (score < 10 || score > 990 || score % 5 != 0) {
			System.out.print("輸入格式錯誤。");
		} else if (score >= 860) {
			System.out.print("證照顏色：金色");
		} else if (score >= 730) {
			System.out.print("證照顏色：藍色");
		} else if (score >= 470) {
			System.out.print("證照顏色：綠色");
		} else if (score >= 220) {
			System.out.print("證照顏色：棕色");
		} else {
			System.out.print("證照顏色：橘色");
		}
	}
}
