import java.util.Scanner;
class ZooApp 
{
	public static void main(String[] args) 
	{
		Scanner asc = new Scanner(System.in);
		zoo z =new zoo();
		for(;;)
		{
		System.out.println("1.cat 2.dog 3.lion 4.exit");
		switch(sc.nextInt())
			{
				case 1 : 
				{
					z.factory(new cat());
					break;
				}
				case 1 : 
				{
					z.factory(new dog());
					break;
				}
				case 1 : 
				{
					z.factory(new lion());
					break;
				}
				case 1 : 
				{
					System.exit(0);
				}
			}
		}
	}
}
