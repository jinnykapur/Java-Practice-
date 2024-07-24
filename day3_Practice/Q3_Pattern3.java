package day3_Practice;
import java.util.*;
//RIGHT PASCAL'S TRIANGLE pattern
/*
             * 
          *  * 
       *  *  * 
    *  *  *  * 
 *  *  *  *  * 
    *  *  *  * 
       *  *  * 
          *  * 
             * 

 */


public class Q3_Pattern3 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int row=1;
		int star=1;
		int space = n-1;
		while(row<2*n) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
			//star
			int j = 1;
			while(j<=star) {
				System.out.print(" * ");
				j++;
			}
			//mirror concept
			if(row<n) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			//next row preparation
			row++;
			System.out.println();
			
			
		}
		
		
		
	}}