package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		double total = 0;
		System.out.println("Enter the value of n : ");
		
		Scanner obj = new Scanner(System.in);
		
		int n = obj.nextInt();
		
		for (double i = 1; i <= n ; i++) {
			total= total +1/i;
		}
		System.out.println(total);
		obj.close();
	}

}
