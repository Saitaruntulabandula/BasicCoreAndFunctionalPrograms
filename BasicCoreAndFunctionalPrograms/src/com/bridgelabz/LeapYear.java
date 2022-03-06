package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	int year, count=0;
	System.out.println("Enter the year to check leap or not:");
	Scanner obj = new Scanner(System.in);
	year = obj.nextInt();
	int tempn=year;
	while(tempn!=0) {
		tempn = tempn/10;
		count++;
	}
	if (count == 4) {
		if((year%4 == 0) && year % 100 != 0 || (year % 400 == 0))
			System.out.println("Given year is a leap year");
		else 
			System.out.println("Given year is not a leap year");
	}else
		System.out.println("Please enter the valid input...");
	obj.close();
	}
}
