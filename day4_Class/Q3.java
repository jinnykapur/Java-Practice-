package day4_Class;

public class Q3 {
	public static void main(String[] args) {
		int n=5;
	int rn=2*n-1;
	int star=1;
	int i=1;
	
	while(i<=rn) {
		int j=1;
		while(j<=star) {
			System.out.print("* ");
			j++;
		}
		if(i<n) {
			star++;
		}
		else {
			star--;
		}
		i++;
		System.out.println();
	}

	
	}
}
