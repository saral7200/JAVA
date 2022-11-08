package org.study;

public class StaticTask5 extends StaticTask4{
	static int v = 25;
	public static void m12() {
		//17.static variable into static method--->using extends
		System.out.println(j);
		//13.static method into static method--->using extends
		m9();
	}
	public void m13() {
		//15.static variable into non static method--->using extends
		System.out.println(j);
		//11.static method into non static method--->using extends
		m9();
	}
}
