import java.io.*;

public class w7_inclass04 {
		public static void main(String[] args) throws IOException 
	{
		String str;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入累乘最大數n：");
		str = buf.readLine();
		System.out.println("1 x 2 x 3 x...x " + Integer.parseInt(str) + " = " + fac(Integer.parseInt(str)));
	}
	
	public static int fac(int n)
	{
		if(n ==0)
		{
			return 1;
		}
		else
		{
			return n * fac(n-1);
		}
	}
}