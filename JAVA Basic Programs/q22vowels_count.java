//wajp to read m and n print count of vowels
import java.util.Scanner;
class vowels_count
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in );
System.out.println("enter start character");
char m = sc.next().charAt(0);
System.out.println("enter end character");
char n = sc.next().charAt(0);
char c = m;
int count = 0;
while(c<=n)
{
 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
 {
 count++;
 }
 else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
 {
  count++;
 }
 c++;
}
System.out.println(count);

}
}
