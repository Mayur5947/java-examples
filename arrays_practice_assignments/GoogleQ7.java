import java.util.Scanner;
class GoogleQ7
{
	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[]a = new int[sc.nextInt()];
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter int data");
			a[i] = sc.nextInt();
		}
		for(int i =  0 ; i<a.length ; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(" sum of array element is " +sum);
		
		
	}
}
