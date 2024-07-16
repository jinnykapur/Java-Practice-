package day1_Practice;

import java.util.*;

public class Q5_Print_the_digts_the_given_number {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		
		int nod=0;
		int num=n;
		while(num!=0) {
			num=num/10;
			nod++;
		}
		int div=(int)Math.pow(10, nod-1);
		
		while(div!=0) {
			int q=n/div;
			int r=n%div;
			System.out.println(q);
			n=r;
			div=div/10;
		}
		
	}

}
