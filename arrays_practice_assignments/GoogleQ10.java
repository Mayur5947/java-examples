import java.util.Scanner;
class GoogleQ10
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
		int [] b = new int [a.length];
		for(int i =  0; i<a.length ; i++)
		{
			b[i] = a[i];
		}
		for(int i =  0; i<b.length ; i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
	}
}
