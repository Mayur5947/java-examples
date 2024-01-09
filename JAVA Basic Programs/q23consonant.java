// wajp to read m and n print consonant
import java.util.Scanner;
class consonant
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
 if(c>='a'&&c<='z'&&c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
 {
  System.out.print(c + " " );
 }
 else if(c>='A'&&c<='Z'&&c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U')
 {
  System.out.print(c);
 }

 c++;
}

}
}
