import java.util.Scanner;
class GoogleQ24
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[]a = new int[sc.nextInt()];
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter first array data");
			a[i] = sc.nextInt();
		}
		int count = 0;
		System.out.println(" enter number which u want to find in array");
		int find = sc.nextInt();
		for(int i = 0 ; i<a.length ; i++)
		{
			if(a[i]==find)
			{
				System.out.print(a[i]);
				count++;
			}
            
		}
		if(count==0)
			System.out.println("number not found in series");


			
	}
}
