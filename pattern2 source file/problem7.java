class problem7
{
	public static void main(String[] args) 
	{
		int a = 1;
		for(int i=1 ; i<=5 ; i++)
		{
			if(i%2!=0)
			{
			for(int j=1 ;j<=i; j++)
			{
				System.out.print( "*"+ " ");
			}
			}
			else
			{
			for(int j=1 ;j<=i; j++)
			{
				System.out.print( "#"+ " ");
			}
			}
			System.out.println();
			
		}
	}
}
