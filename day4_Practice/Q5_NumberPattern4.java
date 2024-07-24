package day4_Practice;
import java.util.*;
public class Q5_NumberPattern4 {
	
/*
	
5
				1	
			2	2	2	
		3	3	3	3	3	
	4	4	4	4	4	4	4	
5	5	5	5	5	5	5	5	5	

	
*/
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;

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
                
                System.out.print(row + "\t");
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

