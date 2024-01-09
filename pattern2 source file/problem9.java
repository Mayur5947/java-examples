class problem9
{
	public static void main(String[] args) 
	{
		int a = 0;
		for(int i=1 ; i<=5 ; i++)
		{
			
			for(int j=1 ;j<=i; j++)
			{
				if(a>2)
			{
				a=0;
			}
				System.out.print(a+ " ");
				a++;
			}
			System.out.println();
			
		}
	}
}
