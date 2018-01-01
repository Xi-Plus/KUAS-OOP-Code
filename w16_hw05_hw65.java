import java.io.*;

class w16_hw05_hw65 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		int count;
		String name[], sex[], classes[];
		int year[];
		
		while (true) {
			System.out.print("要輸入幾筆資料？ ");
			try {
				count = Integer.parseInt(buf.readLine());
				name = new String[count];
				sex = new String[count];
				classes = new String[count];
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

			while (true) {
				System.out.print("請輸入年齡：");
				try {
					year[q] = Integer.parseInt(buf.readLine());
					break;
				} catch(NumberFormatException e) {
					System.out.println("請輸入整數，請重新輸入");
				}
			}

			System.out.print("請輸入科系：");
			classes[q] = buf.readLine();
		}

		String action = "";
		while (!action.equals("D")) {
			System.out.print("選擇功能 A. 顯示 B. 查詢 C. 修改 D. 離開 ：");
			action = buf.readLine();
			switch (action) {
				case "A":
					for (int q=0; q<count; q++) {
						System.out.println("姓名為"+name[q]);
						System.out.println("性別為"+sex[q]);
						System.out.println("年齡為"+year[q]);
						System.out.println("科系為"+classes[q]);
						System.out.println();
					}
					break;

				case "B":
					while (true) {
						try {
							System.out.print("請輸入要查詢的編號：");
							int choose = Integer.parseInt(buf.readLine());
							System.out.println("姓名為"+name[choose]);
							System.out.println("性別為"+sex[choose]);
							System.out.println("年齡為"+year[choose]);
							System.out.println("科系為"+classes[choose]);
							System.out.println();
							break;
						} catch(NumberFormatException e) {
							System.out.println("請輸入整數，請重新輸入");
						} catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("編號超過範圍，請重新輸入");
						}
					}
					break;

				case "C":
					while (true) {
						try {
							System.out.print("請輸入要修改的編號：");

							int choose = Integer.parseInt(buf.readLine());
							name[choose] = "";

							System.out.print("請輸入姓名：");
							name[choose] = buf.readLine();

							System.out.print("請輸入性別：");
							sex[choose] = buf.readLine();

							while (true) {
								System.out.print("請輸入年齡：");
								try {
									year[choose] = Integer.parseInt(buf.readLine());
									break;
								} catch(NumberFormatException e) {
									System.out.println("請輸入整數，請重新輸入");
								}
							}

							System.out.print("請輸入科系：");
							classes[choose] = buf.readLine();

							System.out.println();
							break;
						} catch(NumberFormatException e) {
							System.out.println("請輸入整數，請重新輸入");
						} catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("編號超過範圍，請重新輸入");
						}
					}
					break;

				case "D":
					System.out.println("已離開程式");
					break;

				default:
					System.out.println("沒有這項功能");
					break;
			}
		}
	}
}
