//Wajp to read a number and print factors of that number
import java.util.Scanner;
class factor
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter number");
int a = sc.nextInt();
int b = 1;
while(b<=a)
{
 if(a%b==0)
 {
   System.out.println(b);
 }
 b++;
}
}
}
