import java.util.Scanner;
class OlaApp 
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	OlaDriver od = new OlaDriver();
	for(;;)
		{
			System.out.println("1.signup 2.login 3.logout 4.make ride 5. cancel ride 6. exit");
			switch(sc.nextInt())
			{
				case 1 : od.signup();
				break;
				case 2 : od.login();
				break;
				case 3 : od.logout();
				break;
				case 4 : od.make_A_ride();
				break;
				case 5 : od.cancel_A_ride();
				break;
				case 6 : System.exit(0);
			}
		}
	}
}
