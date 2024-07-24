package day4_Practice;
import java.util.*;

/*

7
      * 
    *   * 
  *       * 
*           * 
  *       * 
    *   * 
      * 


*/

public class Q1_diamondwindow {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int s1 = n/2;
		int s2 = -1;
		while(row<=n) {
			//space 1
			int i=1;
			while(i<=s1) {
				System.out.print("  ");
				i++;
			}
			//single star print
			System.out.print("* ");
			//between space or space 2
			int j=1;
			while(j<=s2) {
				System.out.print("  ");
				j++;
			}
			//single star
			if(row>=2 && row<n) {
				System.out.print("* ");
			}
			
			//mirror concept
			if(row<n/2+1) {
				s1 --;
				s2 +=2;
			}
			else {
				s1 ++;
				s2 -= 2;
			}
			//next row preparation
			row++;
			System.out.println();
		}
	}

}
