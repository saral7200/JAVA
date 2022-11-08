package org.study;

public class StringTasks {
	public static void main(String[] args) {
		String s1 = "GreensTechnology";
		String s2 = "SeleniumAutomationtool";
		String s3 = "velmurugan";
		String s4 = "j a v a p r o g r a m";
		String s5 = "9095484678";
		
		int l1 = s1.length();
		int l2 = s2.length();
		int l3 = s3.length();
		int l4 = s4.length();
		int l5 = s5.length();
		
		System.out.println(l1+"\n"+l2+"\n"+l3+"\n"+l4+"\n"+l5);
		
		int i1 = s1.indexOf("o");
		int i2 = s2.indexOf("o");
		int i3 = s3.indexOf("n");
		int i4 = s4.lastIndexOf(" ");
		int i5 = s5.indexOf("8");
		
		System.out.println("Answer is : "+"\n"+i1+"\n"+i2+"\n"+i3+"\n"+i4+"\n"+i5);
		
		char c1 = s1.charAt(9);
		char c2 = s2.charAt(11);
		char c3 = s3.charAt(4);
		char c4 = s4.charAt(8);
		char c5 = s5.charAt(8);
		
		System.out.println("Characters are "+"\n"+c1+"\t"+c2+"\t"+c3+"\t"+c4+"\t"+c5);
		
	}
}
