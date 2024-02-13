//Design a method to merge two sorted array in the sorted form.
import java.util.Scanner;
class GoogleQ47 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first array size");
		int[]a=new int [sc.nextInt()];

		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter data ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter second array size");
		int[]b = new int[sc.nextInt()];
		for(int i=0;i<b.length;i++)
		{
			System.out.println("enter data ");
			b[i] = sc.nextInt();
		}

		m1(a , b);
		
	}
	public static void m1(int[]a , int[]b)
	{

		int c [] = new int [a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j = i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		int index = 0;
		for(int i = 0;i<c.length;i++)
		{
			
			if(i<a.length)
				c[i] = a[i];
			else
			{
				c[i] = b[index++];
			}
			System.out.print(c[i] + " ");
		}
	}
}
