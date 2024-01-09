class  program58
{
	public static void main(String[] args) 
	{
		int a =1;
		for(int i=1 ; i<=5 ; i++)
		{
			if(i%2!=0)
			{
			for(int j = 1 ; j<=5 ;j++)
			{
				if(j>=i)
					System.out.print("*" + " ");
				else
					System.out.print("  ");
				
				
				
			}
			}
			else
				{
			for(int j = 1 ; j<=5 ;j++)
			{
				
				if(j>=i)
					System.out.print(a + " ");
				else
					System.out.print("  ");
				
				
			}
				a++;
			}
			System.out.println();
		}
	}
}
