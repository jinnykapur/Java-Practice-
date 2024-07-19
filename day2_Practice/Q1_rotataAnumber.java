package day2_Practice;
import java.util.*;
public class Q1_rotataAnumber {
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter the number: ");
	int n = scn.nextInt(); //number
	System.out.print("Enter the value by which you want it to be rotated: ");
	int k = scn.nextInt(); //to how many digits the number needs to be rotated
	
	//find number of digits (nod)
	int num=n;
	int nod=0;

	while (num!=0) {
		num=num/10;
		
		nod=nod+1;
	}
	
	k=k%nod;
	
	if(k<0) {
		k=nod+k;
	}
	//Set value of div = 10^k and mult =10^nod-k
	
	int div = (int)Math.pow(10,k);
	int mult = (int)Math.pow(10,nod-k);
	
	//find the vales of quotient and remainder
	
	int q = n / div;
	int r = n % div;
	
	//Find the final answer
	int ans = (r * mult) + q;
	 System.out.println("Final Answer: " + ans);
		
	}
	
	
}
