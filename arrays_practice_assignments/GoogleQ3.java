import java.util.Scanner;
class GoogleQ3 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter size");
		int [ ] a = new int [sc.nextInt()];
		System.out.println();
		int countEven = 0;
		int countOdd = 0;
		for(int i=0 ; i< a.length ; i++)
		{
			System.out.println("enter int data");
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length  ; i++)
		{
			if(a[i]%2==0)
				countEven++;
			else
			countOdd++;
		}
			System.out.println("count of even numbers is  " + countEven);
			System.out.println("count of odd numbers is  " + countOdd);
	}
}
