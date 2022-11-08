package org.study;

public class EvenNumber {
	public static void main(String[] args) {
		int n=50;
		int count = 0;
		for(int i=1;i<n;i++) {
			i=i+1;
			count++;
			System.out.println(i);
		}
		System.out.println("count of even numbers is "+count);
	}
}
