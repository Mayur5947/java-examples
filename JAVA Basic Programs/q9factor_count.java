//wajp to read a number print count of factor of that number.
import java.util.Scanner;
class factor_count
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter number");
int a = sc.nextInt();
int b = 1;
int count = 0;
while(b<=a)
{
 if(a%b==0)
 {
   count++;
 }
 b++;
}
System.out.println(count);
}
}
