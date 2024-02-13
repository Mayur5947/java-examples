//Design a method to return how many palindrome are there in the array.
import java.util.Scanner;
class GoogleQ40
{
	public static void main(String[] args) 
	{
		int countPall= 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[]a = new int[sc.nextInt()];
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter int data");
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i< a.length ; i++)
		{
			boolean b = m1(a[i]);
		    if(b)
				countPall++;
		}
		System.out.println( countPall + " pallandrome number in this series");

	}
	public static boolean m1(int a)
	{
		int count = 0;
		int temp=a;
		int temp1 = a;
		int plus = 0 ;

		while(a>0)
		{
			count++;
			a = a/10;
		}
		int [] x = new int [count];
		for(int i = 0 ; i < x.length ; i++)
		{
			x[i]  = temp%10;
			temp = temp/10;
		}
		
		int [] y = new int [x.length];
		int index = x.length-1;

		for(int i = 0 ; i < x.length ; i++)
		{
			
			y[i] = x[index--];
		}
		for(int i = 0 ; i < x.length ; i++)
		{
			if(x[i]==y[i])
				plus++;


		}
		if(plus==count)
			return true;
		else
			return false;
		
	}
	
	
}