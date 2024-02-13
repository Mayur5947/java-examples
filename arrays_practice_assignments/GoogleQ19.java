import java.util.Scanner;
class GoogleQ19 
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
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]!=0)
			{
			if(i<a.length-1)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
						a[j]=0;
				}
			}
			}
		}
		for(int i=0 ; i< a.length ; i++)
		{
			if(a[i]!=0)
			System.out.print(a[i] + " ");
		}
		
		
	}
}