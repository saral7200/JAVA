package org.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class jeeva {
	int b;
	   
	public int  m1(int a) {
		
		b=a+b;
		System.out.println(b);
		return b;
		}
	public int m2(int a) {
		b=a-b;
		System.out.println(b);
		return b;
		}
	private void m3(int a, int b) {
		b=a*b;
		System.out.println(b);

	}
	
	public WebElement findElement(By id) {
		return null;
		
	}
	public static void main(String[] args) {
		jeeva j=new jeeva();
		
		int add = j.m1(5);
		int sub = j.m2(7);
		j.m3(add, sub);
	}

}
