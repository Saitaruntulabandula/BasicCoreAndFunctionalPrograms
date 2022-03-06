package com.bridgelabz;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the value first number:");
		 
		int a=obj.nextInt();
		
        System.out.println("Enter the value second number:");
		
		int b=obj.nextInt();
		
        System.out.println("Enter the value third number:");
		
		int c=obj.nextInt();
		
		obj.close();
		
		if(a>=b&a>=c) {
			System.out.println("First number is Largest i.e "+a);
		}
		else if(b>=c) {
			System.out.println("Second number is Largest i.e "+b);
		}
		else {
			System.out.println("Third number is Largest i.e "+c);
		}
	}

}
