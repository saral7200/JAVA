package org.study;

public class XTask {
	public void m1() {
		System.out.println("Java");
	}
	public void m2(int a) {
		System.out.println(a);
	}
	public void m2(int a, String b) {
		System.out.println("m2 parent");
		System.out.println(a+"\n"+b);
	}
}
