//Wajp to read two integer data from the user print largest data Without using else and condition operator
import java.util.Scanner;
class largest_data_without
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st number");
int a = sc.nextInt();
System.out.println("enter 2nd number");
int b = sc.nextInt();
if(a>b)
{
 System.out.println(a);
  System.exit(1);
}
System.out.println(b);


}
}