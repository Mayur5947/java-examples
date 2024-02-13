//Desing a method to sort the elements of an array in descending order
import java.util.Scanner;
class GoogleQ52
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
		    	if(a[i]>a[j])
		    	{
		    		int temp = a[i];
		    		a[i] = a[j];
		    		a[j]  = temp;
		    	}
		    }
		}

		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		
	}
	
}