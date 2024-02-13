import java.util.Scanner;
class GoogleQ9
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
		int max = a[0];
		for(int i =  1; i<a.length ; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}

			
		}
		for(int i =  0; i<a.length ; i++)
		{
			if(a[i]==max)
			{
				a[i]=0;
			}

			
		}
		int max2 = a[0];
		for(int i = 1 ; i < a.length ; i++)
		{
			if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println("   second maximum number is ==== " + max2);
		
		
		
	}
}
