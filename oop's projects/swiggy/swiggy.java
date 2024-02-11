import java.util.Scanner;
class swiggy 
{
	static
	{
		System.out.println("**********************welcome      to       swiggy************************************");
	}
	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);
		hotel1 h = new hotel1();
		for(;;)
		{
			System.out.println("1. create acccount 2. remove account 3.choose hotel 4.cancel order  5.exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 : h.createAccount();
				break;
				case 2 : h.removeAccount();
				break;
				case 3 : h.chooseHotel();
				break;
				case 4 : h.cancelOrder();
				break;
				case 5 : System.exit(0);
			}
		}
	}
}
