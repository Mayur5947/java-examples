//Design a method to display number of occurrence of each element in the array.
import java.util.Scanner;
class GoogleQ48
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

	public static void m1(int[]a)
	{
		for(int i = 0; i<a.length;i++)
		{
			int count = 1;
			for(int j = 0 ; j< a.length ; j++)
			{
				if(i!=j)
				{
					if(a[i]==a[j])
					{
						a[j]=0;
						count++;
					}
				}
			}
			if(a[i]!=0)
			{
			System.out.println("count of "+a[i]+" is "+count);
			}
			System.out.println();
			
		}
	}
}
