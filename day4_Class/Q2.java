package day4_Class;

public class Q2 {
	public static void main(String[] args) {
int n=4;
int i=1;
int star=4;
int row=n;
int space=0;
while(i<=row) {
	int j=1;
	while(j<=space) {
		System.out.print("");
		j++;
	}
	int k=1;
	while(k<=star) {
		System.out.print("* ");
		k++;
	}
	i++;
	star--;
	space++;
	System.out.println();
}
}
}