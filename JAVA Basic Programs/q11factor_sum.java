//wajp to read a number print sum of factor
import java.util.Scanner;
class factor_sum
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter number");
int a = sc.nextInt();
int b = 1;
int sum = 0;
while(b<=a)
{
 if(a%b==0)
 {
   sum = sum + b;
 }
 b++;
}
System.out.println(sum);
}
}
