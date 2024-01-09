//Design a method to convert meter square to centimeter square.
import java.util.Scanner;
class conversion3
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter meter square");
float a = sc.nextFloat();
float b  =  a*10000;
System.out.println(b + " " + "centimeter square");
}
}
