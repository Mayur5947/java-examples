import java.util.Scanner;
class GoogleQ6
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
		int index = a.length-1;
		for(int i =  index ; i>=0 ; i--)
		{
			
			System.out.print(a[i] + " ");
		}
		
		
	}
}
