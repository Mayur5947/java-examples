//wajp to read m and n print which divisible by 5 and 3 from m to n
import java.util.Scanner;
class divisible_by_3_5
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter start");
int m = sc.nextInt();
System.out.println("enter end point");
int n =sc.nextInt();
int x = m;
for(x=m ; x<=n ;x++) 
{
  if(x%3==0||x%5==0)
  {
   System.out.println(x);
  }
}
}
}
