package day3_Class;

public class Q3_RightTrianglePattern {
	
	public static void main(String[] args) {
		
	int row=1;
	
	int star=1;
	int n=5;
	
	while(row<=n) {
		
		int i=1; //Initialization of a counter
		
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
