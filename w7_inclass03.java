import java.io.*;

public class w7_inclass03 {
	public static void main(String[] args)throws IOException{
		int num1 , num2;
		char a;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入矩形的第一邊");
		num1 = Integer.parseInt(buf.readLine());
		System.out.println("請輸入矩形的第二邊");
		num2 = Integer.parseInt(buf.readLine());
		System.out.println("請選擇要顯示的訊息 (1)周長 (2)面積 (3)判斷矩形種類");
		a = buf.readLine().charAt(0);
		//選擇功能
		switch(a)
		{
			case '1':
				perimeter(num1 , num2);	//周長
				break;
			case '2':
				area(num1 , num2);	//面積
				break;
			case '3':
				type(num1 , num2);	//判斷矩形種類
				break;
		}
		
	}
	public static void perimeter(int a , int b)
	{
		System.out.println("矩形周長為：" + 2*(a+b) );
	}
	public static void area(int a , int b)
	{
		System.out.println("矩形面積為：" + a*b);
	}
	public static void type(int a , int b)
	{
		if(a==b) System.out.println("此矩形為正方形");
		else     System.out.println("此矩形為長方形");
	}
}