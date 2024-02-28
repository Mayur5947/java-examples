package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_program2 {

	public static void main(String[] args) {
		//// here the use of iterator method
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Traversing list through Iterator
		Iterator itr = list.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());// printing the element and move to next
		}
	}
}
