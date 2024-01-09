//Design a method to convert mb to kb
import java.util.Scanner;
class mb_to_kb
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter mb");
float a = sc.nextFloat();
float b  =  a*1000;
System.out.println(b + " " + "kb");
}
}
