package collectionsFramework.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(13);
		list.add(15);
		list.add(5);
		System.out.println(list);
		Collections.reverse(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		System.out.println("Java 8");
		list.forEach(System.out::println);
	}

}
