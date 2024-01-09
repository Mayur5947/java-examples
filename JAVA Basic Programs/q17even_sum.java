//wajp to read m and n print sum of even
import java.util.Scanner;
class even_sum
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter start");
int m = sc.nextInt();
System.out.println("enter end point");
int n =sc.nextInt();
int sum = 0;
for(int x = m ; x<=n ;x++) 
{
  if(x%2==0)
  {
   sum = sum + x;
  }
}
System.out.println(sum);
}
}
