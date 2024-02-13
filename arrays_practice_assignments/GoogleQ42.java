//Design a method to create the duplicate of existing array.
import java.util.Scanner;
class GoogleQ42
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

		int [] b  = new int [a.length];

		for(int i = 0 ; i< b.length ; i++)
		{
			b[i] = a[i] ;
			System.out.print(b[i] + " ");
		}
		
	}
	
}