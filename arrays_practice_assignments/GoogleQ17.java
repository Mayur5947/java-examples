import java.util.Scanner;
class GoogleQ17
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[]a = new int[sc.nextInt()];
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter data");
			a[i] = sc.nextInt();
		}
		System.out.println("enter index to delete from  aarray ");
		int index  = sc.nextInt();
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(i==index)
				a[i]=0;
		}
		for(int i =  0; i<a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		
		
		
	}
}
