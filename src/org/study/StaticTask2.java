package org.study;

public class StaticTask2 extends StaticTask {
	static int s = 21;
	public void m3() {
		//5.non static method into non static method--->using extends(different class)
		m1();
		//7.static variable into non static method--->direct access
		System.out.println(s);
	}
	public static void m4() {
		//8.static variable into static method--->direct access
		System.out.println(s);
	}
}
