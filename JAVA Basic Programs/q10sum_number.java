//wajp to read a number print sum of that  number
import java.util.Scanner;
class sum_number
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter number");
int a = sc.nextInt();
int sum = 0 ;
while(a>0)
{
 int b = (a%10);
 sum = sum  + b;
 a = a/10;
b++;
}
System.out.println(sum);

}
}
