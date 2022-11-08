package org.study;

public class XTask1 extends XTask {
	public void m2(int a, String b) {
		System.out.println("m2 child");
		System.out.println(a+"\n"+b);
	}
	public void m2(int a, int b) {
		
		System.out.println(a+"\n"+b);
	}
	public void m3() {
		System.out.println("End");
	}
	public static void main(String[] args) {
//		XTask xt = new XTask();
//		xt.m1();
//		xt.m2(1);
//		xt.m2(3, "FIRST");
//		
//		XTask1 xt1 = new XTask1();
//		xt1.m1();
//		xt1.m2(9);
//		xt1.m2(5, "SECOND");
//		xt1.m2(2, 7);
//		xt1.m3();
		
		XTask xt2 = new XTask1();
		xt2.m1();
		xt2.m2(1);
		xt2.m2(10,"m2" );
		
//		XTask1 xt3 = new XTask();
	}
}


