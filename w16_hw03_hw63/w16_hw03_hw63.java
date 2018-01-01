import java.io.*;

class w16_hw03_hw63 {
	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		int m, kg;

		while (true) {
			while (true) {
				System.out.print("請輸入身高：");
				try {
					m = Integer.parseInt(buf.readLine());
					if (m < 0) {
						throw new NegativeNumberException();
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println("請輸入整數");
				} catch (NegativeNumberException e) {
					System.out.println("請輸入正數");
				}
			}

			while (true) {
				System.out.print("請輸入體重：");
				try {
					kg = Integer.parseInt(buf.readLine());
					if (kg < 0) {
						throw new NegativeNumberException();
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println("請輸入整數");
				} catch (NegativeNumberException e) {
					System.out.println("請輸入正數");
				}
			}

			try {
				System.out.println("BMI為"+(kg/m/m));
				break;
			} catch (ArithmeticException e) {
				System.out.println("身高不可為0，請重新輸入");
			}
		}
	}
}
class NegativeNumberException extends Exception {

}
