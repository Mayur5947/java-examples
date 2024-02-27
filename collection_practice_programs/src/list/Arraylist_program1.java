package list;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_program1 {

	public static void main(String[] args) {
		List list =  new ArrayList();
		// we can add  homogeneous as well as hetrogeneous objects in list.
		
		list.add(10);
		list.add("mayur");
		list.add('a');
		list.add(true);
		list.add(10.00);
		System.out.println(list);
		
		// output ----> [10, mayur, a, true, 10.0]
		
		list.add(2, 20);// we can add value at specific index of arraylist
		System.out.println(list);
		
		// output ----- > [10, mayur, 20, a, true, 10.0]
		
		//list.clear();// this method will clear the list
		
		System.out.println(list.contains(20));// this method will check that particular object is present in lsit or not
		// it will return boolean value
		//output ----> true
		
		System.out.println(list.get(1));// we can fetch object present is list at sepecific index)
		//output ----->  mayur
		
	
	}
}
