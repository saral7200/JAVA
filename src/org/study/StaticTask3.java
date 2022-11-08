package org.study;

public class StaticTask3 {
	public void m5() {
		//6.non static method into non static method--->by object creation access(different class without extends)
		StaticTask st = new StaticTask();
		st.m1();
	}
	public static void m6() {
		System.out.println("Selenium");
	}
	public void m7() {
		//9.static method into non static method--->direct access
		m6();
	}
	public static void m8() {
		//10.static method into static method--->direct access
		m6();
	}
	public void m14() {
		//4.instance variable into non static method--->by object creation access(different class without extends)
		StaticTask st = new StaticTask();
		System.out.println(st.a);
	}
}
