import java.io.*;

public class w6_hw04_hw23 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("請輸入學生人數：");
		String test[] = {"平時", "期中", "期末", "學期"};
		int range[] = {0, 59, 60, 69, 70, 79, 80, 89, 90, 100};
		int group[][] = new int[4][range.length/2];
		int min[] = {100, 100, 100, 100};
		int max[] = {0, 0, 0, 0};
		int n = Integer.parseInt(buf.readLine());
		int v[][] = new int[n][4];

		for (int q=0; q<n; q++) {
			for (int w=0; w<3; w++) {
				System.out.print("輸入第"+(q+1)+"個學生的"+test[w]+"成績：");
				v[q][w] = Integer.parseInt(buf.readLine());
			}
			v[q][3] = (int)(v[q][0] * 0.3 + v[q][1] * 0.35 + v[q][2] * 0.35);
			for (int w=0; w<4; w++) {
				for (int e=0; e<group[0].length; e++) {
					if (v[q][w] >= range[e*2] && v[q][w] <= range[e*2+1]) {
						group[w][e]++;
						break;
					}
				}
			}
			for (int w=0; w<4; w++) {
				if (v[q][w] < min[w]) {
					min[w] = v[q][w];
				}
				if (v[q][w] > max[w]) {
					max[w] = v[q][w];
				}
			}
		}

		int act = 0;
		while(act != 6) {
			System.out.print("\n選擇操作：1. 顯示每個學生的全部成績 2. 列出學期成績不及格的同學及分數 3. 顯示各個分數的組距的人數 4. 詢某一個學生的成績 5. 列出成績的最高及最低分 6. 結束程式  ");
			act = Integer.parseInt(buf.readLine());
			switch (act) {
				case 1:
					for (int q=0; q<n; q++) {
						System.out.print("第"+(q+1)+"個學生的");
						for (int w=0; w<4; w++) {
							System.out.print(" "+test[w]+"成績："+v[q][w]);
						}
						System.out.println();
					}
					break;
				case 2:
					boolean nofail = true;
					System.out.println("不及格的學生有：");
					for (int q=0; q<n; q++) {
						if (v[q][3] < 60) {
							System.out.println("學生"+(q+1)+"："+v[q][3]+"分");
							nofail = false;
						}
					}
					if (nofail) {
						System.out.println("沒有不及格的學生");
					}
					break;
				case 3:
					System.out.println("分數組距：");
					for (int q=0; q<4; q++) {
						System.out.println(test[q]+"成績：");
						for (int w=0; w<group[0].length; w++) {
							if (group[q][w] != 0) {
								System.out.println(range[w*2]+"~"+range[w*2+1]+" 有"+group[q][w]+"人");
							}
						}
					}
					break;
				case 4:
					System.out.print("您要查詢第幾位學生？ ");
					int x = Integer.parseInt(buf.readLine());
					System.out.print("第"+x+"個學生的");
					for (int w=0; w<4; w++) {
						System.out.print(" "+test[w]+"成績："+v[x-1][w]);
					}
					System.out.println();
					break;
				case 5:
					System.out.print("您要查詢 a：平時成績、b：期中成績、c：期末成績、d：學期成績 ");
					switch (buf.readLine().charAt(0)) {
						case 'a':
						case 'A':
							System.out.println("最高分："+max[0]+" 最低分："+min[0]);
							break;
						case 'b':
						case 'B':
							System.out.println("最高分："+max[1]+" 最低分："+min[1]);
							break;
						case 'c':
						case 'C':
							System.out.println("最高分："+max[2]+" 最低分："+min[2]);
							break;
						case 'd':
						case 'D':
							System.out.println("最高分："+max[3]+" 最低分："+min[3]);
							break;
					}
					break;
				case 6:
					System.out.println("程式結束");
					break;
			}
		}
	}
}
