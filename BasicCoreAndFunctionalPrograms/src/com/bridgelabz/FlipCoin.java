package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int number;
		float percentageOfHead=0, percentageOfTail = 0, countOfHeads = 0, countOfTails = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of trails to flip the coin:");
		number = obj.nextInt();
		if(number > 0) {			
			for (int i=1; i<=number; i++) {
				float coin = (float) Math.random();
				System.out.println(coin);
				if(coin > 0.5 ){
					countOfHeads++;
				}else {
					countOfTails++;
					}
				}
			}else {
			System.out.println("Enter a valid Positive number");
			}
		    percentageOfHead = (countOfHeads/number)* 100;
		    percentageOfTail = (countOfTails/number)* 100;
			System.out.println(countOfHeads);
			System.out.println(countOfTails);
			System.out.println(" Percentage of head is " +percentageOfHead + " %");
			System.out.println(" Percentage of tail is " +percentageOfTail + " % ");		
			obj.close();
	}

}
