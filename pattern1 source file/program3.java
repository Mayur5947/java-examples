//wajp to print
//a a a a a
//b b b b b
//c c c c c
//d d d d d
//e e e e e 
class program3 
{
	public static void main(String[] args) 
	{
		char a = 'a';
		for(int i=1 ; i<=5 ; i++)
		{
			
			for(int j = 1 ; j<=5 ; j++)
			{
				System.out.print(a);
			}
			System.out.println();
			a++;
		}
	}
}
