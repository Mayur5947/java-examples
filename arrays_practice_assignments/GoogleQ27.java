import java.util.Scanner;
class GoogleQ27
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first array size");
		int[]a = new int[sc.nextInt()];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter first array data");
			a[i] = sc.nextInt();
		}
		System.out.println("enter second array size");
		int[]b = new int[sc.nextInt()];
		for(int i = 0 ; i<b.length ; i++)
		{
			System.out.println("enter second array data");
			b[i] = sc.nextInt();	
		}
		if(a.length==b.length)
			System.out.println("both arrays are of same length");
		else
			System.out.println("both arrays are of different length");
	}
}
