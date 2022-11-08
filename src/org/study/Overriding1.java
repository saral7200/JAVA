package org.study;

public class Overriding1 extends Overriding {
	@Override
	public void m1() {
		System.out.println("Saral");
		super.m1();
	}
	public static void main(String[] args) {
		Overriding1 or = new Overriding1();
		or.m1();
	}
}
