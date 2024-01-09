class problem8
{
	public static void main(String[] args) 
	{
		int a=10;
		for(int i = 1 ; i<=5 ; i++)
		{
			for(int j = 1 ; j<=i ; j++)
			{
				if(a>90)
				{
					a=10;
				}
				System.out.print((a)+ " ");
				a=a+10;
			    
		    }
			System.out.println();
			
			
		}
	}
}
