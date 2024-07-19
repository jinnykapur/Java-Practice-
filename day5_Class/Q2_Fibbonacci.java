package day5_Class;
import java.util.*;
public class Q2_Fibbonacci {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int count=scn.nextInt();
		int n1=0;
		int n2=1;
		
		int i=1;
		while(i<=count) {
			//System.out.println(n1);
			int sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
		}
		
		int r=n2-n1;
		System.out.print("The "+ count + "th digit of the given series is " + r + ".");
	}
}
