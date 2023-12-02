package array_practice_programs;
// Write a Java program to sort a numeric array and a string array
public class program1 {
	public static void main(String[] args) {
		int [] a = {20,5,70,49,33,45,778,412,20};
		System.out.println(a.length);
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					int temp = a[i];
					a[i]= a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
	for (int i : a) {
		System.out.print(i+ " ");
	}
	}

}
