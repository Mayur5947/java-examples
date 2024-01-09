//Design a method to convert kilogram to gram.
import java.util.Scanner;
class kg_to_g
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter kilogram");
float a = sc.nextFloat();
float b  =  (a*1000);
System.out.println(b + " " + "gram");
}
}
