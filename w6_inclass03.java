import java.io.*;

public class w6_inclass03{
	public static void main(String[] args) throws IOException 
	{
		String subject[] = {"計概" , "數學" , "英文"};
		double a[][] = new double[2][4];
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i < a.length; i++)
		{
			for (int j=0; j < subject.length; j++)
			{
				System.out.print("請輸入第" + (i+1) + "位同學的" + subject[j] + "成績(0~100)：");
				String str = buf.readLine();
				a[i][j] = Double.parseDouble(str);
			}
		}

		System.out.println("同學\t\t計概\t數學\t英文\t平均");
		System.out.println("-------------------------------------");
		for(int i=0; i<2; i++)
		{
			a[i][3] = (a[i][0] + a[i][1] + a[i][2])/3;
			System.out.println("第" + (i+1) + "位同學：\t" + a[i][0] + "\t" + 
			                     a[i][1] + "\t" + a[i][2] + "\t" + a[i][3] + "\t");
		}

	}

}
