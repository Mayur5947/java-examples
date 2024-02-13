//Design a method to find the first and second smallest element of the array.
import java.util.Scanner;
class GoogleQ50
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
		m1(a);
		
		
	}

	public static void m1(int [] a )
	{
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j=0; j<a.length ; j++)
		    {
		    	if(a[i]<a[j])
		    	{
		    		int temp = a[i];
		    		a[i] = a[j];
		    		a[j]  = temp;
		    	}
		    }
		}

		System.out.println("first smallest number is ---->  " +a[0]);
		System.out.println("  second smallest number is ---->"+a[1]);
		
		
	}
	
}