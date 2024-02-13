import java.util.Scanner;
class GoogleQ23
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
		int countEven = 0;
		int countOdd = 0;
		
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i]%2==0)
				countEven++;
			else
				countOdd++;	
		}
		int []even  = new int [countEven];
		int [] odd = new int[countOdd];
		 int index = 0;
		 int index1 = 0;
		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i]%2==0)
			{
				even[index++]=a[i];
			}
			if(a[i]%2!=0)
				odd[index1++]=a[i];
		}
		System.out.println("array of even numbers");
		for(int i=0 ; i<countEven ; i++)
		{
			
			System.out.print(even[i]+ " ");
		}
		System.out.println();
		System.out.println("array of odd numbers ");
		for(int i=0 ; i<countOdd ; i++)
		{
			
			System.out.print(odd[i]+ " ");
		}



			
	}
}
