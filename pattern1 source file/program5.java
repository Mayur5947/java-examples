//wajp to print
//a a a a a
//b b b b b
//c c c c c 
//d d d d d 
//e e e e e 
class  program5
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=5 ; i++)
		{
			if(i%2!=0)
			{
			for(int j = 1 ; j<=5 ; j++)
			{
				System.out.print('a');
			}
			}
			else
			{
			for(int j = 1 ; j<=5 ; j++)
			{
				System.out.print('b');
			}
			}
			System.out.println();
		}
	}
}
