package org.study;

public class StaticTask {
	int a = 12;
	public void m1() {
		//1.instance variable into non static method--->direct access(same class)
		System.out.println(a);
	}
	public void m2() {
		//2.non static method into non static method--->direct access(same class)
		m1();
	}
}
