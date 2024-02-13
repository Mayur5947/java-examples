//Design a method to check how many numbers are divisible by 4,3and 5 in the array.
import java.util.Scanner;
class GoogleQ39
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
		m1(a);
	}
	public static void m1(int [] a)
	{
		int count = 0 ;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i]%3 == 0 || a[i]%4 == 0 || a[i]%5 == 0)
				count++;
		}
		System.out.println(" total numbers in arrays which are divisble by 3 , 4 , and 5 are ---------> " + count);
	}
	
}
