package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the X value:");
		final int x = scanner.nextInt();
		System.out.println("Enter the Y value:");
		final int y = scanner.nextInt();
		scanner.close();
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("The Euclidean distance is :" + distance);
	}
}
