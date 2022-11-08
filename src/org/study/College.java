package org.study;

public class College extends University {
	@Override
	public void ug(String name) {
		System.out.println("ENGINEERING");
		super.ug(name);
	}
	@Override
	public void pg(String name1) {
		System.out.println("ME");
		super.pg(name1);
	}
	public static void main(String[] args) {
		College c=new College();
		c.ug("MEDICINE");
		c.pg("MS");
	}
}
