import java.io.*;

public class w7_inclass02 {
	public static void main(String[] args) throws IOException 
	{
		String str;
		int array[];
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入陣列的大小：");
		str = buf.readLine();
		array = new int[Integer.parseInt(str)];
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println("請輸入陣列的第" + (i+1) + "個數值：");
			str = buf.readLine();
			array[i] = Integer.parseInt(str);
		}
		
		add10(array);
		
		for(int i=0; i<array.length; i++) System.out.print(array[i] + " ");
		
	}
	
	public static int[] add10 (int arr[])
	{
		for (int i=0; i<arr.length; i++) arr[i] += 10;
		
		return arr;
		
	}
}