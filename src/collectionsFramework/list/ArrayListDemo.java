package collectionsFramework.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(1);
		l.add('a');
		l.add("ab");
		l.add(null);
		l.add(null);
		l.add(1,null);
		System.out.println(l);
		l.remove(null);
		System.out.println(l);
		l.set(4, "Hello");
		System.out.println(l);
	}

}
