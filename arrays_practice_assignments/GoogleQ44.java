//Design a method to add unique elements and return from the array.
import java.util.Scanner;
class GoogleQ44
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
		
		int sum = m1(a);

		System.out.print("sum is  " + sum);
	}

	public static int m1(int a[])
	{
		for(int i = 0; i<a.length;i++)
		{
			if(i<a.length-1)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
						a[j]=0;
				}
			}
			
		}

		int sum = 0;
		for(int i = 0 ; i<a.length ; i++)
		{
			if(a[i]!=0)
				sum = sum + a[i];
		}
		return sum;
	}
	
}