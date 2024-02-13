import java.util.Scanner;
class GoogleQ14
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[]a = new int[sc.nextInt()];
		System.out.println("enter value u want to enter in array");
		int value  = sc.nextInt();
		System.out.println("enter index where  u want to enter in array");
		int index  = sc.nextInt();
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(i==index)
				a[i]=value;
		}
		for(int i =  0; i<a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		
		
		
	}
}
