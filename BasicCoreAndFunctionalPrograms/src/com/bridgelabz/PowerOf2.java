package com.bridgelabz;

public class PowerOf2 {

	public static void main(String[] args) {
		int exponent =Integer.parseInt(args[0]);
		 int result = 1;
		 for(int i=1; i<=exponent; i++)
	        {
	            result = result * 2;   
		        System.out.println(result);
	        }
	}
}
