//Desing a method to return how many even numbers in the passed array.
import java.util.Scanner;
class GoogleQ33
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[]a = new int[sc.nextInt()];
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter int data");
			a[i] = sc.nextInt();
		}
		
		int even  = m1(a);
		System.out.println("even numbers in given arrays are ---> " + even);
		
	}
	public static int m1(int [] a)
	{
		int count = 0 ;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
	
}
