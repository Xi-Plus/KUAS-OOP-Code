import java.io.*;

public class w18_exam4 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		double answer[] = new double[3];
		for (int index=0; true; index++) {
			try {
				System.out.print("請輸入三角形的底跟高（格式：底,高）：");
				String input[] = buf.readLine().split(",");
				if (input.length < 2) {
					throw new NumberFormatException();
				}
				double a = Double.parseDouble(input[0]);
				double b = Double.parseDouble(input[1]);
				answer[index] = a*b/2;
				System.out.println("面積為"+answer[index]);
				System.out.print("是否繼續運算？（是/否）：");
				if (buf.readLine().equals("否")) {
					System.out.println("程式結束");
					break;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("陣列索引值超過上限，程式結束！");
				break;
			} catch (NumberFormatException e) {
				System.out.println("輸入格式錯誤，請重新輸入！");
				index--;
			} catch (ArithmeticException e) {
				System.out.println("分母不可為0，請重新輸入！");
				index--;
			} catch (Exception e) {
				System.out.println("例外錯誤！");
				index--;
			}
		}
	}
}
