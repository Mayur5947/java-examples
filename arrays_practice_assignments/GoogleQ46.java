//Design a method to merge two array element in zigzag manner.
import java.util.Scanner;
class GoogleQ46 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("first array size");
		int []a = new int[sc.nextInt()];
		
		
		System.out.println("second array size");
		int []b = new int[sc.nextInt()];
		
		for(int i = 0 ; i<a.length;i++)
		{
			System.out.println("first array");
			System.out.println("enter data");
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i<b.length;i++)
		{
			System.out.println("second  array");
			System.out.println("enter data");
			b[i] = sc.nextInt();
		}
		

		m1(a , b);
		
		
	}
	public static void m1(int[] a , int b[])
	{
		int index = 0;
		int [] c = new int [(a.length+b.length)] ;
		int length = 0;
		if(a.length>b.length)
			length=a.length;
		else
			length= b.length;
		for(int i = 0 ; i<length ; i++)
		{
           c[index] = a[i];
		   index++;
		   if(i<b.length)
			{
		      c[index] = b[i];
			  index++;
			}
			
		}
		for(int i=0 ; i < c.length ; i++)
		{
				System.out.print(c[i] + "   ");
		}
		
	}
}
