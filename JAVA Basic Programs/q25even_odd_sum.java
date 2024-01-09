//wajp to read m and n print sum of even and odd
import java.util.Scanner;
class even_odd_sum
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter start");
int m = sc.nextInt();
System.out.println("enter end point");
int n =sc.nextInt();
int sum = 0;
int sum1 = 0;
for(int x = m ; x<=n ;x++) 
{
  if(x%2==0)
  {
   sum = sum + x;
  }
  else
  {
   sum1 = sum1 + x;
   }
}
System.out.println("sum of even number is" + " " +sum);
System.out.println("sum of odd number is" + " " +sum1);

}
}
