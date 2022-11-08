package org.study;

public class Jeeva2 extends Jeeva1 {
	public void m4 () {
		System.out.println("abc");
	}
	public void m2() {
		System.out.println("efg");
		//super.m2();
	}
	public static void main(String[] args) {
		Jeeva2 j = new Jeeva2();
		j.m2();
		
		Jeeva2 j1 = (Jeeva2) new Jeeva1();
		j1.m4();
	}
	public static void Jeeva1() {
		return ;
	}

}
