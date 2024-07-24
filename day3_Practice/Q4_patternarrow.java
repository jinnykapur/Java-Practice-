package day3_Practice;
import java.util.*;

/*
 n=5 row=9 
 *  *  *  *  * 
       *  *  *  * 
             *  *  * 
                   *  * 
                         * 
                   *  * 
             *  *  * 
       *  *  *  * 
 *  *  *  *  * 

 */

public class Q4_patternarrow {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r=1; 
		int space = 0;
		
		int star = n;
		
			
		while(r <= 2*n-1) {
			//space
			int i = 1 ;
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
			if(r<n) {
				space=space+2;
				star=star-1;
				
			}
			else {
				space=space-2;
				star=star+1;
			}
			
			//next row preparation
			
			r++;
			System.out.println();
	}
		


}}
