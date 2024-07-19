package day2_Practice;
import java.util.*;
public class Q3_nxn_matrix_pattern {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n = scn.nextInt();
		System.out.println("Pattern:");
		int row = 1;
		int star =n;
		
		while(row <= n) {
			//star
			int i = 1;
			
			while(i<=star) {
				System.out.print(" * ");
				i++;
			}
			//next row preparation 
			row++;
			System.out.println();
		}
		
	}

}
