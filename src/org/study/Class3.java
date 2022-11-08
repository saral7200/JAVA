package org.study;

public class Class3 extends Class2 {
	public void area(String name) {
		System.out.println(name);
	}
	public void area1(String name) {
		System.out.println(name);
	}
	public void area2(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Class3 c=new Class3();
		c.name();
		c.id();
		c.bike();
		c.degree();
		c.year(2018);
		c.area("Mangadu");
		c.phone();
		c.num();
		car();
		c.name1();
		c.id1();
		c.bike1();
		c.degree1();
		c.year1(2019);
		c.area1("Karapakkam");
		c.phone1();
		c.num1();
		car1();
		c.name2();
		c.id2();
		c.bike2();
		c.degree2();
		c.year2(2017);
		c.area2("Thoraipakkam");
		c.phone2();
		c.num2();
		Car2();
	}
}
