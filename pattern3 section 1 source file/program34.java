class  program34
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			char ch = 'A';
			for(int j = 1 ; j<=5 ;j++)
			{
				
				if(i+j>=6)
				{
					System.out.print(ch+" ");
					ch++;
				
				}
				else
						System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}
