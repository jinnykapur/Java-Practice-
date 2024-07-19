package day5_Class;
import java.util.*;

public class Q1_PrimeNotPrime {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int n = scn.nextInt();
		
		int a = 2;
		boolean isPrime = true;
		while(a<=n/2) {
			if(n%a==0) {
				isPrime=false;
				break;
			}
			
		}
		
		if(isPrime) {
			System.out.println(n + " is a Prime Number.");
		}
		else {
			System.out.println(n + " is not a Prime Number.");
		}
	}
		
}
