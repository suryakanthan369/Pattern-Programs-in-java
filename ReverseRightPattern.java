package Com.PatternPrograms;

import java.util.Scanner;

public class ReverseRightPattern {
	public static void Pattern(int n) {
		int i, j;
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j + " ");//we can print also "*" in print statement
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

//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 