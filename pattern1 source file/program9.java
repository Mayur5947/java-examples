//wajp to print
//5 10 15 20 25
//2  4  6  8 10
//5 10 15 20 25
//2  4  6  8 10
//5 10 15 20 25
class program9 
{
	public static void main(String[] args) 
	{
	 for(int i=1 ; i<=5 ; i++)
		{
		 int a = 5;
		 int b = 2;
		 if(i%2==0)
			{
			 for(int j=1 ; j<=5 ; j++)
				{
			     System.out.print(a+ " ");
			      a=a+5;
			     }
			}
			else
			{
				for(int j=1 ; j<=5 ; j++)
				{
					System.out.print(b+ " ");
					b=b+2;
				}
			}
			System.out.println();
		}

	}
}
