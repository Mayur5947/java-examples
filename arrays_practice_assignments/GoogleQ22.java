import java.util.Scanner;
class GoogleQ22
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
		System.out.println("enter size");
		int b [] = new int[sc.nextInt()];
		for(int i = 0 ; i < b.length ; i++)
		{
			System.out.println("enter secoond aray data");
			b[i] = sc.nextInt();
		}
		int length ;
		if(a.length>b.length)
			length=a.length;
		else
			length=b.length;
		int [] c = new int[a.length+b.length];
		int index = 0;
		for(int i = 0 ; i< length ; i++)
		{
			
			if(i<a.length)
			{
				c[index]=a[i];
				index++;
			}
			if(i< b.length)
			{
				c[index]=b[i];
				index++;
			}
		}
		for(int i = 0 ; i< c.length ; i++)
		{
			System.out.print(c[i]+ " ");
		}
		
		
		
		
	}
}
