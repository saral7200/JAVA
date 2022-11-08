package org.study;

public class AxisBank extends BankInfo {
	@Override
	public void deposit(int dep) {
		System.out.println(dep);
		super.deposit(2000);
	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit(5000);
	}
}
