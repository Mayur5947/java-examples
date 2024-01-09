class  program57
{
	public static void main(String[] args) 
	{
		int a =1;
		for(int i=1 ; i<=5 ; i++)
		{
			
			for(int j = 1 ; j<=5 ;j++)
			{
				
				if(j>=i)
				{
					System.out.print((a%2)+" ");
					a++;
					
				
				}
				else
						System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}
