//wajp to read m and n print count of even and odd
import java.util.Scanner;
class odd_even
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter start");
int m = sc.nextInt();
System.out.println("enter end point");
int n =sc.nextInt();
int count = 0;
int count1 = 0;
for(int x = m ; x<=n ;x++) 
{
  if(x%2==0)
  {
   count++;
  }
  else
  {
   count1++;
  }
}
System.out.println("count of even is" + " " + count);
System.out.println("count of odd is " + " " + count1);
}
}
