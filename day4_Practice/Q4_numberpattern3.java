package day4_Practice;
import java.util.*;

/*

5
				1	
			2	3	4	
		5	6	7	8	9	
	10	11	12	13	14	15	16	
17	18	19	20	21	22	23	24	25	


*/

public class Q4_numberpattern3 {
	
	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int row = 1;
	        int star = 1;
	        int space = n - 1;
	        int val = 1;

	        while (row <= n) {
	            // space
	            int i = 1;
	            while (i <= space) {
	                System.out.print("\t");
	                i++;
	            }

	            // star
	            int j = 1;
	            while (j <= star) {
	                System.out.print(val + "\t");
	                val++;
	                j++;
	            }

	            // next row preparation
	            System.out.println();
	            row++;
	            star += 2;
	            space--;
	        }

	       
	    }
	}
