package org.study;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTask {
	public static void main(String[] args) {
		Map m = new Hashtable();
		m.put("x", 1);
		m.put("y", 2);
		m.put("z", 3);
		Object object = m.get("y");
		System.out.println(object);
		System.out.println(m);
		Set <Entry<String,Integer>>entrySet = m.entrySet();
		System.out.println(entrySet);
	}
}
