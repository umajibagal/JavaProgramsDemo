package collectionsFramework.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(11, "abc");
		map.put(2, "two");
		System.out.println(map);
		map.put(1, "one");
		System.out.println(map);
		System.out.println(map.get(1));
		map.keySet().forEach(System.out::print);
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("two"));
		Set <Integer> keys = map.keySet();
		Collection<String> value = map.values();
		System.out.println(keys);
		System.out.println(value);
		Map m;
		TreeMap<Integer, String> tt;
		StringBuffer sb;
		
		StringBuilder sbb;
		
	}
}
