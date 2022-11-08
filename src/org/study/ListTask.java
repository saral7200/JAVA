package org.study;

import java.util.LinkedList;
import java.util.List;

public class ListTask {
	public static void main(String[] args) {
		List li = new LinkedList();
		li.add(2345);
		li.add("Java");
		li.add(null);
		for (Object object : li) {
			System.out.println(object);
		}
	}
}
