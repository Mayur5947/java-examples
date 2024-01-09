//wajp to read hour and convert to seconds
import java.util.Scanner;
class hour_to_seconds
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter hour");
float a = sc.nextFloat();
float b = (a*60);
float c = (b*60);
System.out.println(c+  " " + "seconds");
}
}