package collectionsFramework.set;

import java.util.LinkedHashSet;

public class LinkedhashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet<>();
		lhs.add("A");
		lhs.add(1);
		lhs.add(1.2);
		lhs.add(null);
		System.out.println(lhs);
		lhs.remove(1);
	}

}
