package collectionsFramework.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		hs.add("A");
		hs.add(1);
		hs.add(null);
		hs.add(1.2);
		System.out.println(hs);
		hs.remove(1);
		System.out.println(hs.add("A"));
		System.out.println(hs);
	}

}
