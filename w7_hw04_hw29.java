import java.io.*;

public class w7_hw04_hw29 {
	public static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		System.out.print("輸入學生人數：");
		int n = Integer.parseInt(buf.readLine());
		String name[] = new String[n];
		double score[] = new double[n];

		int k = input_data(name, score);
		show(name, score, k);
		System.out.println("總共輸入 "+k+" 筆資料");
		int act = 0;
		while(act != 7) {
			System.out.print("\n1 顯示及格人數和不及格人數\n"+
				"2 顯示最高分座號及姓名\n"+
				"3 顯示最低分座號及姓名\n"+
				"4 列出各個組距的人數\n"+
				"5 列出不及格的學生座號及姓名\n"+
				"6 修改學生成績\n"+
				"7 離開\n"+
				"請選擇處理方式：");
			act = Integer.parseInt(buf.readLine());
			switch (act) {
				case 1:
					ShowTheNumberOfPassingAndTheNumberOfFailed(score, k);
					break;
				case 2:
					ShowTheHighestSeatAndName(name, score, k);
					break;
				case 3:
					ShowMinimumSeatAndName(name, score, k);
					break;
				case 4:
					ListTheNumberOfPeopleInEachGroup(score, k);
					break;
				case 5:
					ListOfUnqualifiedStudentsSeatNumberAndName(name, score, k);
					break;
				case 6:
					ModifyStudentAchievement(name, score, k);
					show(name, score, k);
					break;
				case 7:
					System.out.println("程式結束");
					break;
			}
		}
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
	public static void ShowTheNumberOfPassingAndTheNumberOfFailed(double score[], int k) {
		int pass = 0;
		for (int q=0; q<k; q++) {
			if (score[q] >= 60) {
				pass++;
			}
		}
		System.out.println("及格："+pass+" 人，不及格："+(k-pass)+" 人");
	}
	public static void ShowTheHighestSeatAndName(String name[], double score[], int k) {
		int HighestSeat=0;
		double HighestScore=0;
		for (int q=0; q<k; q++) {
			if (score[q] > HighestScore) {
				HighestScore = score[q];
				HighestSeat = q;
			}
		}
		System.out.println("最高分為 "+(HighestSeat+1)+" 號，"+name[HighestSeat]);
	}
	public static void ShowMinimumSeatAndName(String name[], double score[], int k) {
		int MinimumestSeat=0;
		double MinimumestScore=100;
		for (int q=0; q<k; q++) {
			if (score[q] < MinimumestScore) {
				MinimumestScore = score[q];
				MinimumestSeat = q;
			}
		}
		System.out.println("最低分為 "+(MinimumestSeat+1)+" 號，"+name[MinimumestSeat]);
	}
	public static void ListTheNumberOfPeopleInEachGroup(double score[], int k) {
		int range[] = {0, 59, 60, 69, 70, 79, 80, 89, 90, 100};
		int group[] = new int[range.length/2];
		for (int q=0; q<k; q++) {
			for (int w=0; w<group.length; w++) {
				if (score[q] >= range[w*2] && score[q] <= range[w*2+1]) {
					group[w]++;
					break;
				}
			}
		}
		System.out.println("分數組距：");
		for (int q=0; q<group.length; q++) {
			if (group[q] != 0) {
				System.out.println(range[q*2]+"~"+range[q*2+1]+" 有"+group[q]+"人");
			}
		}
	}
	public static void ListOfUnqualifiedStudentsSeatNumberAndName(String name[], double score[], int k) {
		System.out.println("不及格學生：");
		for (int q=0; q<k; q++) {
			if (score[q] < 60) {
				System.out.println((q+1)+" 號，"+name[q]);
			}
		}
	}
	public static void ModifyStudentAchievement(String name[], double score[], int k) throws IOException {
		System.out.print("要修改的座號：");
		int n = Integer.parseInt(buf.readLine());
		score[n-1] = input_score();
	}
}
