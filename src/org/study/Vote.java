package org.study;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		System.out.println("Enter Your Age : ");
		Scanner user = new Scanner(System.in);
		int i = user.nextInt();

		if(i>=18) {
			System.out.println("Your Eligible for Vote");
		}else {
			System.out.println("Your NOT Eligible for Vote");
		}
	}
}
