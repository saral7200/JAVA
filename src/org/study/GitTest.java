package org.study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GitTest {
	public static void main(String[] args) {
	Set<String> li = new HashSet<>();
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
	}
}
