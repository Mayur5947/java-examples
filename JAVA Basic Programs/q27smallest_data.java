//Wajp to read two integer data from user print smallest data
import java.util.Scanner;
class smallest_data
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st number");
int a = sc.nextInt();
System.out.println("enter 2nd number");
int b = sc.nextInt();
if(a<b)
 System.out.println("smallest data is " + " " + a);
else
   System.out.println("smallest data is " + " " + b);

}
}