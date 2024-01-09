//Wajp to read two character from the user print smallest one
import java.util.Scanner;
class smallest_character
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st character");
char ch = sc.next().charAt(0);
int a = (int)ch;
System.out.println("enter 2nd character");
char ch1 = sc.next().charAt(0);
int b = (int)ch1;
if(a<b)
{
 System.out.println("smallest character is " + " " + ch);
  System.exit(1);
}
System.out.println("smallest character is " + " " +ch1);


}
}