import java.io.*;

public class w7_hw03_hw28 {
	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.print("輸入學生人數：");
		int n = Integer.parseInt(buf.readLine());
		String name[] = new String[n];
		double score[] = new double[n];

		int k = input_data(name, score);
		show(name, score, k);
		System.out.println("總共輸入 "+k+" 筆資料");
	}
	public static int input_data(String name[], double score[]) throws IOException {
		int q=0;
		for (; q<name.length; q++) {
			System.out.print("輸入學生名稱：");
			name[q] = buf.readLine();
			score[q] = input_score();
			if (q < name.length-1) { // 最後一筆不需要詢問
				System.out.print("是否繼續輸入成績(Y/N)：");
				if (buf.readLine().charAt(0) == 'N') {
					q++;
					break;
				}
			}
		}
		return q;
	}
	public static double input_score() throws IOException {
		double score;
		while (true) {
			System.out.print("輸入總平均的分數：");
			score = Double.parseDouble(buf.readLine());
			if (score >= 0 && score <= 100) {
				break;
			}
			System.out.println("輸入格式錯誤，請重新輸入。");
		}
		return score;
	}
	public static void show(String name[], double score[], int k) {
		System.out.println("學生名稱\t總平均");
		for (int q=0; q<k; q++) {
			System.out.println(name[q]+"\t\t"+score[q]);
		}
	}
}
