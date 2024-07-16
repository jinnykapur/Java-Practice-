package day2_Class;



public class ArithmeticOperators {
	
	//Arithmetic Operators
	//addition(+)sum
	//subtraction(-)
	//multiplication(*)product
	//Division (/)quotient
	//Increment(++ or a=a+5)
	//Decrement(-- or a=a-5)
	//modulus(%)remainder
	
	public static void main(String[] args) {
		
		 int a=6;
		 int b=2;
		 
		 int c=a+b;//addition
		 int d=a/b;//division
		 int e=a%b;//modulus
		 int f=a-b;//subtraction
		 int g=a*b;//multiplication
		 a--;//increment
		 b++;//decrement
		 
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(a--);//a=a-1=6-1=5
		System.out.println(b++);//b=b+1=2+1=3
		
		
		//output:
		//8
		//3
		//0
		//4
		//12
		//5
		//3
	

}
}	
