//Wajp to read three character from the user print largest one
import java.util.Scanner;
class largest_character
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
System.out.println("enter 3rd character");
char ch2 = sc.next().charAt(0);
int c = (int)ch2;
if(a>b && a>c)
   System.out.println("Largest charactcer is " + " " +ch);
else if(b>c && b>a)
   System.out.println("Largest charactcer is " + " " +ch1);
else
   System.out.println("Largest charactcer is " + " " +ch2);


}
}