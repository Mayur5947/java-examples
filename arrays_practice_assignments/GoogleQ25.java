import java.util.Scanner;
class GoogleQ25
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
		for(int i = 0 ; i<a.length ; i++)
		{
			if(i< a.length-1)
			{
				if(a[i]!=0)
				{
					for(int j= i+1 ; j< a.length ; j++)
					{
						if(a[i]>a[j])
					    {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp; 
					    }
					}
				}
			}
			System.out.print(a[i]+ " ");
		}
	}
}
