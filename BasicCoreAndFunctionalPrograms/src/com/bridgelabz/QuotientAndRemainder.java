package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		int dividend,divisor;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Divedend: ");
		dividend = obj.nextInt();
		
		System.out.println("Enter a Divisor: ");
		divisor = obj.nextInt();

	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	    
	    obj.close();
	}

}
