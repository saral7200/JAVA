package org.study;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTask {
	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add(1234);
		s.add("Selenium");
		s.add(null);
		for (Object object : s) {
			System.out.println(object);
		}
	}
}
