package org.study;

public class OddNumber {
	public static void main(String[] args) {
		int n=51;
		int count = 0;
		for(int i=1;i<=n;i++) {
				System.out.println(i);
				i=i+1;
				count++;
		}
		System.out.println("count of odd numbers is "+count);
	}
}
