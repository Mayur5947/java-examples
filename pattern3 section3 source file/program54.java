class  program54
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		for(int i=1 ; i<=5 ; i++)
		{
			
			for(int j = 1 ; j<=5 ;j++)
			{
				
				if(j>=i)
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
