package Com.PatternPrograms;

import java.util.Scanner;

public class RightNumberPattern {
	public static void Pattern(int n) {
		int i, j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String ... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pattern(n);
	}
}


//input = 5
//output
//
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 

