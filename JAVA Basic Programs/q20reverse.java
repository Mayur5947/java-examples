//wajp to read a number and reverse of that
import java.util.Scanner;
class reverse
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter number");
int a = sc.nextInt();
while(a>0)
{
int  b = a%10;
 System.out.print(b);
 a = a/10;
}

}
}
