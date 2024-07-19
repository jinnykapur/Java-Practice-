package day4_Class;

public class Q1 {
	
public static void main(String[] args) {
	int n=5;
	int row=n;
	int star=1;
	int space=n-1;
	int i=1;
	
	while(i<row) {
		int j=1;
		while(j<=space)
		{
			System.out.print("");
			j++;
			
		}
		int k=1;
		while(k<=star) {
			System.out.print("* ");
			k++;
		}
		System.out.println();
		i++;
		space--;
		star++;
	}
}
	
}
