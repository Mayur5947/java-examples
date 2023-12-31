package stl_core_java_assignment;

import java.util.LinkedList;

public class Reverse_Linked_List {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);

		LinkedList linkedList2 = new LinkedList();
		for (int i = (linkedList.size()) - 1; i >= 0; i--) {
			linkedList2.add(linkedList.get(i));
		}
		System.out.println(linkedList2.toString());

	}
}
