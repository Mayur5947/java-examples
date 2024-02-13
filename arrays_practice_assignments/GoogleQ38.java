//Design a method to count how many digits in the array (digits not number).
import java.util.Scanner;
class GoogleQ38
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
			while(a[i]>0)
			{
				count++;
				a[i] = a[i]/10;
			}
		}
		System.out.println(" total digits in arrays are ---------> " + count);
	}
	
}
