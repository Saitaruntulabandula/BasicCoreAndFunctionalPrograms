package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConstant {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);   
		System.out.print(" Enter a Character: "); 
		char ch = obj.next().charAt(0);   
		
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
        obj.close();
	}
}
