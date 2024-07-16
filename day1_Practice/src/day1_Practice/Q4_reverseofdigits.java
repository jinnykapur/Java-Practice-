package day1_Practice;

import java.util.*;

public class Q4_reverseofdigits {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		int n=scn.nextInt();
		
		
		while(n!=0) {
			int r=n%10;
			System.out.print(r);
			n=n/10;
			
			
		}
		
	}
	
}
