//Design a method to calculate the sum and average of the even element of the array.
import java.util.Scanner;
class GoogleQ49
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
		int count = 0 ;

		for(int i = 0; i<a.length;i++)
		{
			if(a[i]%2==0)
				count++;
		}
			int[] even  =  new int [count];
			int index=0;
		for(int i = 0; i<a.length;i++)
		{
			
			if(a[i]%2==0)
				even[index++]=a[i];
		}
		
		int sum = 0;
		for(int i = 0; i<even.length;i++)
		{
			sum = sum + even[i];
		}
		if(sum!=0)
		{
			int average = sum / even.length ;
			System.out.print(" sum of even elements is ---> " + sum + " and average of even element is ---> " + average);
		}
		
		
		
	}
}
