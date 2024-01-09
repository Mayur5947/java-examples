class  program47
{
	public static void main(String[] args) 
	{
		int a  = 1;
		char ch = 'a';
		for(int i=1 ; i<=5 ; i++)
		{
			if(i%2==0)
			{
				for(int j = 1 ; j<=5 ;j++)
			    {
				
				if(i+j<=6)
					{
					System.out.print(ch+" ");
					ch++;
					}
				else
						System.out.print("  ");
				
			   
			}
			}
			else
			for(int j = 1; j<=5 ; j++)
			{
				if(i+j<=6)
				{
				System.out.print(a+" ");
				a++;
				}
				else
				System.out.print("  ");
			}

			System.out.println();
			
		}
			
		
	}
}
