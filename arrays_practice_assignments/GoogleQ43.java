//Design a method to combine two arrays.
import java.util.Scanner;
class GoogleQ43
{
	public static void main(String[] args) 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first aaray size");
		int[]a = new int[sc.nextInt()];
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter int data");
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter second aaray size");
		int[]b = new int[sc.nextInt()];

		for(int i = 0 ; i< b.length ; i++)
		{
			System.out.println("enter int data");
			b[i] = sc.nextInt();
		}

		int [] combine = new int[a.length+b.length];
		int index = 0;
		for(int i=0 ; i < combine.length ; i++)
		{
			
			if(i<a.length)
			{
				combine[i] = a[i];
			}
			else
			{
				
				combine[i] = b[index++];
			}
			System.out.print(combine[i] + " ");

		}
		
	}
	
}