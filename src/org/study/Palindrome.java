package org.study;

public class Palindrome {
	public static void main(String[] args) {
	  int a=1234;
	  int num =a;
	  int rev = 0;
	  while(a>0) {
		  int n=a/10;
		  int b=a%10;
		  rev=(rev*10)+b;
		  a=n; 
	  }
	  if(rev==num) {
		  System.out.println("The given number "+rev+ " is Palindrome");
	  }else {
		  System.out.println("The given number is not a palindrome");
	  }
	}
}
