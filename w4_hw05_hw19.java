import java.io.*;
public class hw19{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean a;
		int number = 0;
		do {
			number = (int)(Math.random()*60)+1;
			a = false;
			if (number == 3 || number == 31 || number == 35 || number == 46 || number == 47 || number == 57) {
				a = true;
				continue;
			}
			System.out.println("點到的號碼為："+number);
			System.out.print("是否繼續點名（Y/N）：");
		} while(a || reader.readLine().charAt(0) == 'Y');
		System.out.println("程式結束");
	}
}
