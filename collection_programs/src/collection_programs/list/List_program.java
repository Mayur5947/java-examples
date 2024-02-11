package collection_programs.list;

import java.util.ArrayList;
import java.util.List;

public class List_program {

	public static void main(String[] args) {

		List list = new ArrayList();
		// we can simply add objects in list using add method
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list); //[10, 20, 30, 40]
		
		//we can add at specific index also
		list.add(2, 50);
		System.out.println(list);//[10, 20, 50, 30, 40]
		
		//we can remove all data from list using clear method
		//list.clear();
		//System.out.println(list);//[] all data is removed
		
		//we can find check whether object  is present or not using contains method 
		System.out.println(list.contains(50));// it will return boolean value // true
		
		//we can find index of specific object
		System.out.println(list.indexOf(40));// output is 4
		
		//we can check list is empty or not
		System.out.println(list.isEmpty());// it will return boolean value // false
		
		
	}
}
