package org.study;

public class Ktm implements  Bike
{

	@Override
	public void cost() {
		System.out.println(203000);
	}
	@Override
	public void speed() {
		System.out.println(143);
	}
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
	}
}
