package org.study;

public class StaticTask4 {
	static int j = 23;
	public static void m9() {
		//18.static variable into static method--->using ClassName.variableName(different class without using extends)
		System.out.println(StaticTask5.v);
		//14.static method into static method--->using ClassName.methodName(different class without using extends)
		StaticTask5.m12();
	}
	public void m10() {
		//16.static variable into non static method--->using ClassName.variableName(different class without using extends)
		System.out.println(StaticTask5.v);
		//12.static variable into non static method--->using ClassName.methodName(different class without using extends)
		StaticTask5.m12();
	}
}
