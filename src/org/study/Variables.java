package org.study;

public class Variables {
	static int a = 23;
	int b=a;
	public void m1() {
		int a = 99;
		System.out.println(a);
	}
	public void m2() {
		int b = 0;
		System.out.println(b);
	}
	public static void main(String[] args) {
		Variables v = new Variables();
		v.m1();
		v.m2();

		Variables v1 = new Variables();
		v1.m2();
		v1.m1();
	}
}
