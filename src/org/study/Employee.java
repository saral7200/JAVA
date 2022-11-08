package org.study;

public class Employee {
	public void empId () {
		System.out.println("S7200");
	}
	public void empId(String name) {
		System.out.println("Employee name is "+name);
	}
	public void empId(int age) {
		System.out.println("Employee age is "+age);
	}
	public void empId(long phone) {
		System.out.println("Employee phone is "+phone);
	}
	public void empId(String name,String address,int id) {
		System.out.println(name+"\t"+address+"\t"+id);
	}
	public void empId(int age,float salary) {
		System.out.println(age+"\t"+salary);
	}
	public void empId(int id,String address,String name) {
		System.out.println(id+"\n"+address+"\n"+name);
	}
	public void empId(float salary,int age) {
		System.out.println(salary+"\n"+age);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId(); 
		e.empId("saral");
		e.empId(27);
		e.empId(9876543210l);
		e.empId("jeeva", "omr", 123);
		e.empId(27, 45.6789f);
		e.empId(789, "PTC", "manoj");
		e.empId(23.4567f, 29);
	}
}
