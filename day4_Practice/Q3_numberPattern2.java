package day4_Practice;

import java.util.*;

public class Q3_numberPattern2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		int i;
		
		while(row<= n) {
			
			//space 
			i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//star
			int j = 1;
			int val=1;
			while(j<=star) {
				System.out.print(val + " ");
				val++;
				j++;
			}
			
			//next row preparation
			space --;
			star +=2;
			
			row++;
			System.out.println();
		}
}}
