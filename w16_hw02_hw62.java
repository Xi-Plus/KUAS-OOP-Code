import java.io.*;

class w16_hw02_hw62 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		int count;
		String name[], sex[];
		int year[];
		
		while (true) {
			System.out.print("要輸入幾筆資料？ ");
			try {
				count = Integer.parseInt(buf.readLine());
				name = new String[count];
				sex = new String[count];
				year = new int[count];
				break;
			} catch (NumberFormatException e) {
				System.out.println("請輸入數字");
			} catch (NegativeArraySizeException e) {
				System.out.println("不得輸入負數");
			}
		}

		for (int q=0; q<count; q++) {
			System.out.print("請輸入姓名：");
			name[q] = buf.readLine();

			System.out.print("請輸入性別：");
			sex[q] = buf.readLine();

			System.out.print("請輸入年齡：");
			try {
				year[q] = Integer.parseInt(buf.readLine());
			} catch(NumberFormatException e) {
				e.printStackTrace();
				year[q] = -1;
			}
			System.out.println("姓名為"+name[q]);
			System.out.println("性別為"+sex[q]);
			if (year[q] == -1) {
				System.out.println("年齡輸入時發生錯誤");
			} else {
				System.out.println("年齡為"+year[q]);
			}
		}
	}
}
