class  program48
{
	public static void main(String[] args) 
	{
		
		for(int i=1 ; i<=5 ; i++)
		{
			int a = 1;
			for(int j = 1 ; j<=5 ;j++)
			{
				
				if(i+j<=6)
				{
					System.out.print((a)+" ");
					a=a+2;
					
				
				}
				else
						System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}
