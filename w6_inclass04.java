import java.io.*;

public class w6_inclass04 {
	public static void main(String[] args) throws IOException {
		int i,min,max;
		String str;
		int a[] = new int[4];
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		min = max = 0;
		for(i = 0; i < a.length; i++)
		{
			System.out.print("請輸入第" + i + "個數字：");
			str = buf.readLine(); 
			a[i] = Integer.parseInt(str);
			
			//存入第一個輸入的數值用於後續判斷最大小值
			if(i == 0) max = min = a[i];
			else
			{
				//判斷最大值
				if(a[i]>max) max = a[i];
				//判斷最小值
				if(a[i]<min) min = a[i];
			}
		}
		System.out.print("Maximun = " + max);
		System.out.print("\nMinimun = " + min);
	}
}
