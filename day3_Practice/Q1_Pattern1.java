package day3_Practice;
import java.util.*;
/*
 n=5
 
 *                       * 
 *  *                 *  * 
 *  *  *           *  *  * 
 *  *  *  *     *  *  *  * 
 *  *  *  *  *  *  *  *  * 

 */
public class Q1_Pattern1 {
	private static Object enter;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); //5
		int row = 1;
		int star = 1;
		int space = 2*n-3;    //7 
		
		while(row<=n) {
			//star => i
			int i = 1;
			while(i<=star) {
				System.out.print(" * ");
				i++;
			}
			//space => j
			int j = 1;
			while (j<=space) {
				System.out.print("   ");
				j++;
			}
			//star => k
			int k=1;
			if(row == n) {
				k=2;
			}
			while(k<=star) {
				System.out.print(" * ");
				k++;
			}
			//next row preparation 
			row++;
			System.out.println();
			star++;
			space -=2;
			
		}
	}

}
