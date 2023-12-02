package array_practice_programs;
//Write a Java program to sum values of an array.
public class program2 {
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50};
		int total = 0 ;
		for (int i : a) {
			total = total+i;
		}
		System.out.println(total);
	}

}
