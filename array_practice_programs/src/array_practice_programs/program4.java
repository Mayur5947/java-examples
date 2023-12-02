package array_practice_programs;
//Write a Java program to calculate the average value of array elements.
public class program4 {

	public static void main(String[] args) {
		int []  a  = {10,20,30,40,50,60};
		int sum = 0;
		for (int i : a) {
			sum = sum + i;
		}
		int average = sum/a.length;
		System.out.println(average);
	}
}
