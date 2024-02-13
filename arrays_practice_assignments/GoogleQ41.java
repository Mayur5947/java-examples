//Design a method to return how many perfect numbers are there in the array.
import java.util.Scanner;
class GoogleQ41
{
	public static void main(String[] args) 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[]a = new int[sc.nextInt()];
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter int data");
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i< a.length ; i++)
		{
			 boolean b = m1(a[i]);
			 if(b)
				 count++;
		}
		System.out.println(" perfect numbers in this series are ------> " + count);

	}
	public static boolean m1(int a)
	{
		int sum = 0;
		for(int i=1 ; i <a ; i++)
		{
			if(a%i==0)
			{
				sum = sum + i ;
			}
		}
		if(sum==a)
			return true;
		return false;
		
	}
	
	
}