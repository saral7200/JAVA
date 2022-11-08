package org.study;

public class Arts extends Education {
	@Override
	public void ug(String name) {
		System.out.println("BE");
		super.ug(name);
	}
	@Override
	public void pg(String name1) {
		System.out.println("ME");
		super.pg(name1);
	}
	public void bSc() {
		System.out.println("cse");
	}
	public void bEd() {
		System.out.println("teacher");
	}
	public void bA() {
		System.out.println("english");
	}
	public void bBa() {
		System.out.println("busi.app.");
	}
	public static void main(String[] args) {
		Arts a=new Arts() ;
		a.ug("BL");
		a.pg("ML");
		a.bSc();
		a.bEd();
		a.bA();
		a.bBa();
	}
}
