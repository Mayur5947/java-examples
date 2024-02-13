import java.util.Scanner;
class GoogleQ11
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int[]a = new int[sc.nextInt()];
		System.out.println("enter value to end of aarray ");
		int end  = sc.nextInt();
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(i==(a.length-1))
				a[i]=end;
		}
		for(int i =  0; i<a.length ; i++)
		{
			System.out.println(a[i] + " ");
		}
		
		
		
		
	}
}
