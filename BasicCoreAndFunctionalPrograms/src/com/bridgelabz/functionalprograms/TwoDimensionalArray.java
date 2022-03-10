package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int row, col;
		int arr[][];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		row = sc.nextInt();
		System.out.print("Enter the number of columns : ");
		col = sc.nextInt();
		arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Input the element for row = " + (i + 1) + " and for column = " + (j + 1) + " : ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Required array is : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");			}
			System.out.println();
		}
		sc.close();
	}
}
