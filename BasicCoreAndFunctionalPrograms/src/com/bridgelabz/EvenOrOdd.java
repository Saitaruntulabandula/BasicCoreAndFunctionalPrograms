package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the value to find Even or Odd:");
		
		/*Defining variable*/ 
		int a=obj.nextInt();
		
		obj.close();
		
		if(a%2==0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
	}
}
