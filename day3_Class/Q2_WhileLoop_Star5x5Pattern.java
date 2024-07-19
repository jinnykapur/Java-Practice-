package day3_Class;

public class Q2_WhileLoop_Star5x5Pattern {
	
	
	public static void main(String[] args) 
	{
		int n = 5;
		int row = 1;
		int star = n;
		
		while (row <= n)
		{
			int i =1; // counter 
			
			while(i <= star)
			{
				System.out.print(" * ");
				i++;
			}
			
			row++;
			System.out.println();
		}

	}

}
