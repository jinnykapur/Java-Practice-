package day4_Practice;
	import java.util.*;
	/*
	
	5
				1	
			1	2	1	
		1	2	3	2	1	
	1	2	3	4	3	2	1	
1	2	3	4	5	4	3	2	1		

		
	*/
	
public class Q6_NumberPattern5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int space = n - 1;
		int row = 1;
		int stars=1;
	
		while(row<=n) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			
			//star
			int j = 1;
			int val=1;
			while(j<=stars) {
				System.out.print(val + "\t");
				if(j<stars/2+1) {
					val++;
				}
				else {
					val--;
				}
				j++;
			}
			//next row preparation
			space--;
			stars+=2;
			row++;
			System.out.println();
		}
		
	}
	}
		
