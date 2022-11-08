package org.study;

public class StringTasks1 {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		
		boolean e1 = s2.equals(s1);
		System.out.println(e1);
		
		String s3 = "Java";
		String s4 = "java";
		
		//boolean e2 = s4.equals(s3);
		boolean eic1 = s4.equalsIgnoreCase(s3);
		System.out.println(eic1);
		
		String s5 = "Green Technology";
		String s6 = "GreenTechnology";
		
		boolean e3 = s6.equals(s5);
		System.out.println(e3);
		
		String s7 = "Nisha";
		String s8 = "nisha";
		
		boolean eic2 = s8.equalsIgnoreCase(s7);
		System.out.println(eic2);
	}
}
