//Wajp to read a number print count of even number in that number
import java.util.Scanner;
class even_count
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter number");
int a = sc.nextInt();
int count = 0;
while(a>0)
{
  int b = a%10;
  if(b%2==0)
  {
   count++;
   }
   a = a/10;
}
System.out.println(count);
}
}
