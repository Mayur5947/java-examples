//Wajp to read two integer data from the user print largest data
import java.util.Scanner;
class largest_data
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st number");
int a = sc.nextInt();
System.out.println("enter 2nd number");
int b = sc.nextInt();
if(a>b)
 System.out.println("largest data is " + " " + a);
else
   System.out.println("largest data is " + " " + b);

}
}