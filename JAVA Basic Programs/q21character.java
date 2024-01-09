//wajp to read m and n as a character print only vowels
import java.util.Scanner;
class character
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter start character");
char m = sc.next().charAt(0);
System.out.println("enter end character");
char n = sc.next().charAt(0);
char c = m;
while(c<=n)
{
 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
 {
 System.out.print(c + " ");
 }
 else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
 System.out.print(c + "  ");
 }
 c++;
}

}
}
