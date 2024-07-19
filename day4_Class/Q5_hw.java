package day4_Class;

public class Q5_hw {
    public static void main(String[] args) {
     
			int n=9;
			int i=0;
			int l=0;
			while(i<n) {
				if(i<n/2+1) {
					int j=i;
					while(j<n/2) {
						System.out.print("* ");
						j++;
					}


				
					int k=n/2-1;
					while(k-l<n/2) {
						System.out.print("  ");
						k++;
					}
					int m=n;
					while(m-l<n) {
						System.out.print("  ");
						m++;
					}
					int o=i;
					while(o<n/2) {
						System.out.print("* ");
						o++;
					}
				}
				else if(i<n) {
					int p=n/2+1;
					while(p<i+1) {
						System.out.print("* ");
						p++;
					}
					int q=i;
					while(q<n) {
						System.out.print("  ");
						q++;
					}
					int r=i+1;
					while(r<n) {
						System.out.print("  ");
						r++;
					}
					int s=n/2+1;
					while(s<i+1) {
						System.out.print("* ");
						s++;
					}
				}
				l++;
				i++;
				System.out.println();
			}
		}
}
