public class w6_inclass02
{
	public static void main(String[] args)
	{
		int num = (int)(Math.random()*26);
		int x, y;
		int park[][] = new int[5][5];
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				park[i][j] = 0;
			}
		}
		for(int i = 0; i < num; i++)
		{
			x = (int)(Math.random()*5);
			y = (int)(Math.random()*5);
			if(park[x][y] == 0)
				park[x][y] = 1;
			else 
				i--;
		}
		System.out.println("目前剩餘：" + (25-num) + "個停車位\n");
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(park[i][j] == 1)
					System.out.print(" X ");
				else
					System.out.print(" O ");
			}
			System.out.println("\n");
		}
	}
}
