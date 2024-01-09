//design a method to convert celsius to fahrenheit.
import java.util.Scanner;
class celsius_to_farhenheit
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter celsius");
float a = sc.nextFloat();
double b  =  (a*1.8) + 32;
System.out.println(b + " " + "farheneit");
}
}
