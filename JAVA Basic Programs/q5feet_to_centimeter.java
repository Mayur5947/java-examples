//Design a method to convert feet to centimeter
import java.util.Scanner;
class feet_to_centimeter
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter feet");
float a = sc.nextFloat();
double b  =  (a*30.48);
System.out.println(b + " " + "centimeter");
}
}
