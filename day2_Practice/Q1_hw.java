package day2_Practice;
import java.util.*;

public class Q1_hw {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int row=scn.nextInt();
	int star;
	int i=1;
	int space;
	
	while(i<=row) {
		star=0;
		space=1;
		
		//spaces
		while(space<=row-i) {
			System.out.print("   ");
			space++;
		}
		
		//star
		while(star != 2*i-1) {
			System.out.print(" * ");
			star++;
		}
		i++;
		System.out.println();
	
	}
}
}
