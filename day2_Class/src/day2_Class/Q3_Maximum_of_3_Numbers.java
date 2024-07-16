package day2_Class;

public class Q3_Maximum_of_3_Numbers {
	
	public static void main(String[] args) {
		
		int a=7, b=5,c=3;
		int max;
		
		if(a>b && a>c) {
			System.out.print("A is the greatest.");
			
		}
		else if(b>a && b>c) {
			System.out.print("B is the greatest.");
		}
		else if(c>a && c>b) {
			System.out.print("C is the greatest.");
		}
		else {
			System.out.print("INVALID");
		}
		
	}

}
