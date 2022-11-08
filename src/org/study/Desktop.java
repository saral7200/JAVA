package org.study;

public class Desktop implements SoftWare {
	private void desktopModel() {
		System.out.println("Inspiron 14 5420");
	}
	@Override
	public void hardwareResources() {
		System.out.println("MotherBoard");
	}
	@Override
	public void softwareResources() {
		System.out.println("Windows 11");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.hardwareResources();
		d.softwareResources();
		d.desktopModel();
	}
}
