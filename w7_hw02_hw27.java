import java.io.*;

public class w7_hw02_hw27 {
	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.print("輸入學生人數：");
		int n = Integer.parseInt(buf.readLine());
		String name[] = new String[n];
		double score[] = new double[n];

		input_data(name, score);
		show(name, score);
	}
	public static int input_data(String name[], double score[]) throws IOException {
		for (int q=0; q<name.length; q++) {
			System.out.print("輸入學生名稱：");
			name[q] = buf.readLine();
			score[q] = input_score();
		}
		return name.length;
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
	public static void show(String name[], double score[]) {
		System.out.println("學生名稱\t總平均");
		for (int q=0; q<name.length; q++) {
			System.out.println(name[q]+"\t\t"+score[q]);
		}
	}
}
