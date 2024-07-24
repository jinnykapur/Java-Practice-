package day3_Practice;
import java.util.*;
/*
 
left PASCAL'S TRIANGLE PATTERN
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
public class Q2_Pattern2 {
	
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int row = 1;
	        
	        while (row <= 2 * n - 1) {
	            int star;
	            if (row <= n) {
	                star = row;
	            } else {
	                star = 2 * n - row;
	            }
	            
	            int count = 1;
	            while (count <= star) {
	                System.out.print(" * ");
	                count++;
	            }
	            
	            System.out.println();
	            row++;
	        }
	        
	     
	    }
	}