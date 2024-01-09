//Wajp to read a number check all the digits if its even print else do not print
import java.util.Scanner;
class even_print
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter number");
int a = sc.nextInt();
while(a>0)
{
  int b = a%10;
  if(b%2==0)
  {
   System.out.print(b);
   }
   a = a/10;
}
}
}
