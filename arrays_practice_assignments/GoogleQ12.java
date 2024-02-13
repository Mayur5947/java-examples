import java.util.Scanner;
class GoogleQ12
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[]a = new int[sc.nextInt()];
		System.out.println("enter value to start  aarray ");
		int start  = sc.nextInt();
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(i==0)
				a[i]=start;
		}
		for(int i =  0; i<a.length ; i++)
		{
			System.out.print(a[i]+ " ");
		}
		
		
		
		
	}
}
