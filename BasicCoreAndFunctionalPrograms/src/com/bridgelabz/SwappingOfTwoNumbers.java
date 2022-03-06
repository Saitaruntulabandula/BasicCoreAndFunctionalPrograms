package com.bridgelabz;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the values of first number:");
		
		int a=obj.nextInt();
		System.out.println("Enter the values of second number:");
		
		int b=obj.nextInt();
		System.out.println("The values of first number and second number before Swapping:"+a+","+b);
		
		obj.close();
		
		/*Swapping variables*/  
        a = a + b;   
        b = a - b;   
        a = a - b;
		
        System.out.println("The values of first number and second number after Swapping:"+a+","+b);

	}

}
