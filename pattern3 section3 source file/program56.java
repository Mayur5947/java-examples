class  program56
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		int a =1;
		for(int i=1 ; i<=5 ; i++)
		{
			if(i%2!=0)
			{
			for(int j = 1 ; j<=5 ;j++)
			{
				
				if(j>=i)
				{
					System.out.print(a+" ");
					
					
				
				}
				else
						System.out.print("  ");
				
			}
			
			a++;
			}
			else
			{
				for(int j = 1 ; j<=5 ;j++)
			{
				
				if(j>=i)
				{
					System.out.print(ch+" ");
					
					
				
				}
				else
						System.out.print("  ");
				
			}
			ch++;
			}
			System.out.println();
			
		}
	}
}
