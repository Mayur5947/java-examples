//Design a method to delete the element at a particular index.
import java.util.Scanner;
class GoogleQ37
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
		Scanner sc = new Scanner(System.in);
		System.out.println(" which index u want to delete ");
		int choice = sc.nextInt();
		for(int i = 0 ; i < a.length ; i++)
		{
			if(choice==i)
			{
				a[i]=0;
			}
			System.out.print(a[i] + " ");
		
		}
	}
	
}
