package day2_Practice;
import java.util.*;

public class Q2_hw {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int star = 1;
	
	while(row<=n) {
		int i=1;
		while(i<=star) {
			System.out.print(" * ");
			i++;
		}
		row++;
		System.out.println();
		star++;
	}
}
}
