package day2_Practice;

import java.util.Scanner;

public class Q2_GCDandLCM {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int n1 = scn.nextInt();
		System.out.print("Enter the 2nd number: ");
		int n2 = scn.nextInt();
		int div = n1;
		int dvd = n2;
		while(dvd % div != 0) {
			int r =dvd % div;
			dvd = div;
			div = r;
		}
		int gcd = div;
		int lcm = (n1 * n2) / gcd;
		System.out.println("GCD is :" + gcd);
		System.out.println("LCM is :" + lcm);
	}

}
