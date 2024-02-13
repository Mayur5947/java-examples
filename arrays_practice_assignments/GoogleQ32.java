//Design a method to calculate the average of n elements in an array.
import java.util.Scanner;
class GoogleQ32
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
		System.out.println(" for how much element u want to find out average ");
		int choice = sc.nextInt();

		int sum  = 0 ;
		
		for(int i = 0 ; i < a.length ;i++)
		{
			if(i<choice)
			{
				sum = sum +a[i];
			}
		}
		int average = sum / choice ;
		System.out.println(" average of first   " + choice + " element is " + " " + average);
		
		
		
	}
	
}
