//wajp to read m and n print only even numbers
import java.util.Scanner;
class even_only
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter start");
int m = sc.nextInt();
System.out.println("enter end point");
int n =sc.nextInt();
for(int x = m ; x<=n ;x++) 
{
  if(x%2==0)
  {
   System.out.println(x);
  }
}
}
}
