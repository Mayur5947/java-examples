//Design a method to return nth smallest element.
import java.util.Scanner;
class GoogleQ45
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first aaray size");
		int[]a = new int[sc.nextInt()];
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter int data");
			a[i] = sc.nextInt();
		}
		
		System.out.println(" which smallest number u want (Ex. 1st smallest 2nd smallest)");
		int n = sc.nextInt();

		int smallest = m1(a , n);
		System.out.print(smallest +"  is "+ n +" th  smallest  ");
		
	}

	public static int m1(int [] a , int x)
	{
		int c = 0;
		for(int i=1;i<a.length;i++)
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
			if(i==x-1)
		       c = a[i];
		}
		
		return c;
	}
	
}