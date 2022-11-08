package org.study;

public class Palindrome1 {

	// static String palindrome (int a) {
	//
	// for (int i = a; i <= 5000; ) {
	// int rev = 0;
	// int j = i;
	// while (j > 0) {
	// int n = j / 10;
	// int b = j % 10;
	// rev = (rev * 10) + b;
	// j = n;
	// }
	//
	// if(rev==i) {
	// return "palindrome";
	// }else
	// return "not palindrome";
	//
	//
	// }
	// }

	// public static void main(String[] args) {
	// String palindrome = palindrome(1);

	// }
	// }
	//
	public static void main(String[] args) {

		for (int i = 1; i <= 5000; i++) {
			int rev = 0;
			int j = i;
			while (j > 0) {
				int n = j / 10;
				int b = j % 10;
				rev = (rev * 10) + b;
				j = n;
			}

			if (rev == i) {
				System.out.println("The given number " + rev + "is Palindrome");
			} else {
				System.out.println("The given number is not a palindrome");
			}
		}
	}
}
