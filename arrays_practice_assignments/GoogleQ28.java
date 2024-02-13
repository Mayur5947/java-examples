import java.util.Scanner;
class GoogleQ28
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first array size");
		int[]a = new int[sc.nextInt()];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println("enter first array data");
			a[i] = sc.nextInt();
		}
		 
		int min = a[0];
		int max = a[0];
		for(int i = 1; i<a.length ; i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("maximum number is  =  " + max);
		System.out.println("minimum number is  =  " + min);
	}
}
