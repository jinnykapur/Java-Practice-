package day2_Practice;

import java.util.Scanner;

public class Q4_LeftTriangleStarPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = scn.nextInt();
		System.out.println("Pattern:");
		int row = 1;
		int space = n - 1;
		int star = 1;
		
		while(row <= n) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			//star
			int j=1;
			while(j<=star) {
				System.out.print("*");
				j++;
			}
			//next row preparation
			row++;
			System.out.println();
			star++;
			space--;
			
		}

	}
}
