package exception_Handling;

import java.util.Scanner;

public class withdraw
{
	 public static void main(String[] args) throws InsuffiecientFund
	 {
		 Scanner sc = new Scanner(System.in);
		 int money =100;
		 System.out.println("enter money to be withdrawn");
		 int with = sc.nextInt();
		 if(with>money)
		 {
			 try
			 {
				 throw new InsuffiecientFund("insuffiecient fund ");
			 }
			 catch(InsuffiecientFund i)
			 {
				 System.out.println(i.getMessage());;
			 }
		 }
		 else
		 {
			 System.out.println("withdraw successfull");
		 }
		 
	}

}
