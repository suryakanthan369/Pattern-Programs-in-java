package Com.PatternPrograms;

import java.util.Scanner;

public class NumberTriangle {
	public static void Pattern(int n) {
		int i, j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n-i;j++) 
				{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(i + " ");//print star also by "* " in print statement
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pattern(n);
	}
}

//input = 5
//output

//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5 
