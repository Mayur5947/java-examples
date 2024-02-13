//Desing a method to count and display how many negative and positive numbers present in your array.
import java.util.Scanner;
class GoogleQ35
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
		
		int Negative  = m1(a);
		int Positive  = m2(a);
		System.out.println("negative  numbers in given arrays are ---> " + Negative );
		System.out.println("Positive  numbers in given arrays are ---> " + Positive );
		
	}
	public static int m1(int [] a)
	{
		int countNegative = 0 ;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i]<0)
			{
				countNegative++;
			}
		}
		return countNegative  ;
	}
	public static int m2(int [] a)
	{
		int countPositive = 0 ;
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i]>0)
			{
				countPositive++;
			}
		}
		return countPositive  ;
	}
}
