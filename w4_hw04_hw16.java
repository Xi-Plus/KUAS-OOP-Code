import java.io.*;
public class hw16{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n;
		do {
			System.out.print("輸入風速等級：");
			n = Integer.parseInt(reader.readLine());
		} while(n < 8 || n > 17);
		if (n <= 11) {
			System.out.print("風速等級 "+n+" 為：輕度颱風");
		} else if (n <= 15) {
			System.out.print("風速等級 "+n+" 為：中度颱風");
		} else {
			System.out.print("風速等級 "+n+" 為：強烈颱風");
		}
	}
}
