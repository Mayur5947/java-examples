import java.util.Scanner;
class OlaDriver 
{
	 int make = 0;
	 int signup=0;
	Scanner sc = new Scanner(System.in);
	ola o = new ola();
	int login = 0;
	public void signup()
	{
		
		if(signup==0)
		  {
		  System.out.println("enter name ");
		  String name = sc.next();
		  System.out.println("enter cno ");
		  long cno = sc.nextLong();
		  System.out.println("enter gender ");
		  char gender = sc.next().charAt(0);
		  System.out.println("enter email ");
		  String email = sc.next();
		  o.a = new AccountOla(name , cno , gender , email);
		  System.out.println("Account created");
		  signup++;
		  }
		else
		{
			System.out.println("Account is already created");
		}
		
		
	}
	public void login()
	{
		
			if(signup==0)
		{
			System.out.println("create account first");
		}
		else
		{	
			if(login==0)
		{
			System.out.println("enter contact number");
			long cno = sc.nextLong();
			if(cno==o.a.cno)
			{
				System.out.println("login success");
				login++;
			}
			else
			{
				System.out.println("incorrect contact");
			}
		}
		else
		{
			System.out.println("already logged in");
		}
		}
		
			
	}
	public void logout()
	{
		if(login!=0)
		{
			System.out.println("logout success");
			login--;
			
		}
		else
		{
			System.out.println("make login first");
		}
	}
	public void make_A_ride()
	{
		if(make==0)
		{
		if(login!=0)
		{
			make++;
		System.out.println("enter from");
		String from1 = sc.next();
		System.out.println("enter to");
		String to1 = sc.next();
		System.out.println("enter name");
		String name1 = sc.next();
		System.out.println("enter km");
		int km1 = sc.nextInt();


		System.out.println("1. mini 2. prime 3.sweden");
		int choice = sc.nextInt();//1
		switch(choice)
		{
			case 1 : o = new mini(from1 , to1 , name1,km1);
			break;
			case 2 : o = new prime(from1 , to1, name1,km1);
			break;
			case 3 : o = new sweden(from1 , to1 , name1,km1);
	    }
		if(o instanceof mini)
		{
			mini m1 = (mini)o;
			
			System.out.println("your bill is " + m1.price*m1.km);
		}
		else if(o instanceof prime)
		{
			prime p1 = (prime)o;
			
			System.out.println("your bill is " +p1.price*p1.km);
		}
		else
		{
			sweden s1 = (sweden)o;
			
			System.out.println("your bill is " + s1.price*s1.km);
		}
		login--;
		}
		else
		{
			System.out.println("make login first to make a ride ");
		}
		}
		else
		{
			System.out.println("u already booked a ride");
		}
		
	}
	public void cancel_A_ride()
	{
		if(make!=0)
		    System.out.println("your ride is cancelled ");
		else
		{
			System.out.println("make a ride first");
		}
		make--;
	}
}
