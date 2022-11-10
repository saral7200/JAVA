package org.study;

import java.util.ArrayList;
import java.util.List;

public class GitTest {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("saral");
		li.add("karthi");
		li.add("janakiraman");
		li.add("shanmugam");
		li.add("mani");
		li.add("siva");
		li.add("william");
		li.add("prakash");
		li.add("sultan");
		
		System.out.println(li);
		System.out.println("for each");
		for (String string : li) {
			System.out.println(string);
		}
		System.out.println("for");
	for (int i = 0; i < li.size(); i++) {
		String string = li.get(i);
		System.out.println(string);
	}	
	li.remove(6);
	System.out.println(li);
	
	}
}
